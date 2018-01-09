package com.sun.tour.utils;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by kunpeng on 2016/4/22.
 */
public class ToastUtil {

    private static Toast mToast = null;
    private static final String TAG = "ToastUtil";

    /**
     * 弹系统消息
     *
     * @param context 上下文
     * @param id      资源id in strings.xml
     */
    public static void showToast(@NonNull Context context, @StringRes int id) {
        String text = "";

        try {
            text = context.getResources().getString(id);
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "the id:" + id + "is not found!");
            return;
        }
        if (mToast == null) {
            /*这里是用ApplicationContext，避免内存泄露*/
            mToast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }


    /**
     * 弹系统消息
     *
     * @param text 需要显示的文本
     */
    public static void showToast(@NonNull Context context, @NonNull String text) {
        if (mToast == null) {
            /*这里是用ApplicationContext，避免内存泄露*/
            mToast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(text);
        }
        mToast.show();
    }

    /**
     * 关闭统消息
     */
    public static void dismissToast() {
        if (null != mToast) {
            mToast.cancel();
        }
    }

}


