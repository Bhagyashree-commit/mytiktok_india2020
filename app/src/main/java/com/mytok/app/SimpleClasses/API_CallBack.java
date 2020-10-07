package com.mytok.app.SimpleClasses;

import java.util.ArrayList;

/**
 * Created by Swarajya Group on 11/11/2019.
 */

public interface API_CallBack {

    void ArrayData(ArrayList arrayList);

    void OnSuccess(String responce);

    void OnFail(String responce);


}
