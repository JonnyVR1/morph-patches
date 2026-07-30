package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherPreviewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vcd0 {
    /* JADX INFO: renamed from: a */
    public static void m23817a(RoomPusherPreviewView roomPusherPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        roomPusherPreviewView.a = (FrameLayout) viewGroup.getChildAt(0);
        roomPusherPreviewView.b = (ImageView) viewGroup.getChildAt(1);
        roomPusherPreviewView.c = (LinearLayout) viewGroup.getChildAt(2);
        roomPusherPreviewView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
