package com.ayuan.communication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.activity_fragment2, null);
        text = (TextView) inflate.findViewById(R.id.tv_text);
        return inflate;
    }

    /**
     * 定义一个方法修改TextView的值
     *
     * @param content 接收需要修改的字符串
     */
    public void setText(String content) {
        if (text != null) {
            text.setText(content);
        }
    }
}
