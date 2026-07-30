package p149l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomHeatDesc;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class krl0 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f124368a;

    /* JADX INFO: renamed from: b */
    public View f124369b;

    /* JADX INFO: renamed from: c */
    public SvgAndImageView f124370c;

    /* JADX INFO: renamed from: d */
    public TextView f124371d;

    /* JADX INFO: renamed from: e */
    public TextView f124372e;

    /* JADX INFO: renamed from: a */
    public View m147004a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lrl0.m151496b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public View m147005b(Context context, @Nullable BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc) {
        View viewM147006c = m147006c(context);
        this.f124372e.setText(bLiveVoiceVirtualRoomHeatDesc.desc);
        this.f124371d.setText(bLiveVoiceVirtualRoomHeatDesc.title);
        this.f124370c.m77478e(bLiveVoiceVirtualRoomHeatDesc.icon, bLiveVoiceVirtualRoomHeatDesc.svga);
        GradientDrawable gradientDrawableM217815c = zb2.m217815c(bLiveVoiceVirtualRoomHeatDesc.bgStartColor, bLiveVoiceVirtualRoomHeatDesc.bgEndColor, 10, GradientDrawable.Orientation.BL_TR);
        gradientDrawableM217815c.setColors(new int[]{kvc0.m147358g(bLiveVoiceVirtualRoomHeatDesc.bgStartColor), kvc0.m147358g(bLiveVoiceVirtualRoomHeatDesc.bgEndColor), kvc0.m147358g("#08FFFFFF")});
        this.f124369b.setBackgroundDrawable(gradientDrawableM217815c);
        return viewM147006c;
    }

    /* JADX INFO: renamed from: c */
    public View m147006c(Context context) {
        return m147004a(LayoutInflater.from(context), null);
    }
}
