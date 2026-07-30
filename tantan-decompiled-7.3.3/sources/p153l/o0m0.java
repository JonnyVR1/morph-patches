package p153l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomHeatDesc;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class o0m0 {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f144557a;

    /* JADX INFO: renamed from: b */
    public View f144558b;

    /* JADX INFO: renamed from: c */
    public SvgAndImageView f144559c;

    /* JADX INFO: renamed from: d */
    public TextView f144560d;

    /* JADX INFO: renamed from: e */
    public TextView f144561e;

    /* JADX INFO: renamed from: a */
    public View m165543a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p0m0.m170168b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public View m165544b(Context context, @Nullable BLiveVoiceVirtualRoomHeatDesc bLiveVoiceVirtualRoomHeatDesc) {
        View viewM165545c = m165545c(context);
        this.f144561e.setText(bLiveVoiceVirtualRoomHeatDesc.desc);
        this.f144560d.setText(bLiveVoiceVirtualRoomHeatDesc.title);
        this.f144559c.m78661e(bLiveVoiceVirtualRoomHeatDesc.icon, bLiveVoiceVirtualRoomHeatDesc.svga);
        GradientDrawable gradientDrawableM129824c = gc2.m129824c(bLiveVoiceVirtualRoomHeatDesc.bgStartColor, bLiveVoiceVirtualRoomHeatDesc.bgEndColor, 10, GradientDrawable.Orientation.BL_TR);
        gradientDrawableM129824c.setColors(new int[]{n3d0.m161283g(bLiveVoiceVirtualRoomHeatDesc.bgStartColor), n3d0.m161283g(bLiveVoiceVirtualRoomHeatDesc.bgEndColor), n3d0.m161283g("#08FFFFFF")});
        this.f144558b.setBackgroundDrawable(gradientDrawableM129824c);
        return viewM165545c;
    }

    /* JADX INFO: renamed from: c */
    public View m165545c(Context context) {
        return m165543a(LayoutInflater.from(context), null);
    }
}
