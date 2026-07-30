package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherPreviewView;

/* JADX INFO: loaded from: classes4.dex */
public class xkd0 {
    /* JADX INFO: renamed from: a */
    public static void m211357a(RoomPusherPreviewView roomPusherPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        roomPusherPreviewView.f52364a = (FrameLayout) viewGroup.getChildAt(0);
        roomPusherPreviewView.f52365b = (ImageView) viewGroup.getChildAt(1);
        roomPusherPreviewView.f52366c = (LinearLayout) viewGroup.getChildAt(2);
        roomPusherPreviewView.f52367d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
