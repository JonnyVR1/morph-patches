package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherPreviewView;

/* JADX INFO: loaded from: classes4.dex */
public class vcd0 {
    /* JADX INFO: renamed from: a */
    public static void m197748a(RoomPusherPreviewView roomPusherPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        roomPusherPreviewView.f51516a = (FrameLayout) viewGroup.getChildAt(0);
        roomPusherPreviewView.f51517b = (ImageView) viewGroup.getChildAt(1);
        roomPusherPreviewView.f51518c = (LinearLayout) viewGroup.getChildAt(2);
        roomPusherPreviewView.f51519d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
