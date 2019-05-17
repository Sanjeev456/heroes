package MyAPI;

import java.util.List;

import model.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPI {
 @GET("Heroes")
    Call<List<User>> getUser();
}
