package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileSingleView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class h520 {
    /* JADX INFO: renamed from: a */
    public static void m133622a(MyRoomInProfileSingleView myRoomInProfileSingleView, View view) {
        myRoomInProfileSingleView.f46819d = (MyRoomInProfileSingleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        myRoomInProfileSingleView.f46820e = (VDraweeView) viewGroup.getChildAt(0);
        myRoomInProfileSingleView.f46821f = viewGroup.getChildAt(1);
        myRoomInProfileSingleView.f46822g = viewGroup.getChildAt(2);
        myRoomInProfileSingleView.f46823h = viewGroup.getChildAt(3);
        myRoomInProfileSingleView.f46824i = (FrameLayout) viewGroup.getChildAt(4);
        myRoomInProfileSingleView.f46825j = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        myRoomInProfileSingleView.f46826k = (FrameLayout) viewGroup.getChildAt(5);
        myRoomInProfileSingleView.f46827l = (FrameLayout) viewGroup.getChildAt(6);
        myRoomInProfileSingleView.f46828m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        myRoomInProfileSingleView.f46829n = (VImage) viewGroup.getChildAt(7);
        myRoomInProfileSingleView.f46830o = (FrameLayout) viewGroup.getChildAt(8);
        myRoomInProfileSingleView.f46831p = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        myRoomInProfileSingleView.f46832q = (TextView) viewGroup.getChildAt(9);
        myRoomInProfileSingleView.f46833r = (TextView) viewGroup.getChildAt(10);
        myRoomInProfileSingleView.f46834s = (TextView) viewGroup.getChildAt(11);
    }
}
