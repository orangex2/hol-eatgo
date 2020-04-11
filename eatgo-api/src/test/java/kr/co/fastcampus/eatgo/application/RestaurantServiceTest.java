package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantServiceTest {

    private RestaurantService restaurantService;

    Restaurant restaurant;

    RestaurantRepository restaurantRepository;

    MenuItemRepository menuItemRepository;


    @Before
    public void setUp() {
        restaurantRepository = new RestaurantRepositoryImpl();
        menuItemRepository = new MenuItemRepositoryImpl();

        restaurantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }

    @Test
    public void getRestaurants() {
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        Restaurant restaurant = restaurants.get(0);

        assertThat(restaurant.getId(), is(1004L));
    }

    @Test
    public void getRestaurant() {
        restaurant = restaurantService.getRestaurant(1004L);

        System.out.println(restaurant);
        /*
        assertThat은 assertThat(T actual, Matcher<? super T> matcher)의 형태로 메서드를 사용하여 두 값을 비교할 수 있다.
        첫번째 파라미터에는 비교대상 값을, 두번째 파라미터로는 비교로직이 담긴 Matcher가 사용된다.
         */

        MenuItem menuItem = restaurant.getMenuItems().get(0);

        assertThat(menuItem.getName(), is("Kimchi"));
    }

}
