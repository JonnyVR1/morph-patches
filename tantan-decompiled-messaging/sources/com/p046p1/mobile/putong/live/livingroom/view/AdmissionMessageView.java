package com.p046p1.mobile.putong.live.livingroom.view;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bk40;
import p149l.d30;
import p149l.dt0;
import p149l.e30;
import p149l.e51;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.rfd0;
import p149l.sxj;
import p149l.t100;
import p149l.v90;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class AdmissionMessageView extends FrameLayout {

    /* JADX INFO: renamed from: l */
    public static final float f51823l = t100.f167259h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f51824a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51825b;

    /* JADX INFO: renamed from: c */
    public VImage f51826c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f51827d;

    /* JADX INFO: renamed from: e */
    public LiveGradientTextView f51828e;

    /* JADX INFO: renamed from: f */
    public VText f51829f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51830g;

    /* JADX INFO: renamed from: h */
    public BLiveEnterRoom f51831h;

    /* JADX INFO: renamed from: i */
    public Bitmap f51832i;

    /* JADX INFO: renamed from: j */
    public DownloadTask f51833j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f51834k;

    public AdmissionMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public static GradientDrawable m76354h(int i, List<String> list, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(f51823l);
        int[] iArr = new int[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            iArr[i3] = kvc0.m147359h(list.get(i3), kvc0.m147352a(h1c0.f105390o));
        }
        GradientDrawable.Orientation orientation = i2 == 1 ? GradientDrawable.Orientation.TOP_BOTTOM : (i2 != 2 && i2 == 3) ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT;
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m76355i(@ColorRes int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f51823l);
        gradientDrawable.setColor(kvc0.m147352a(i));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public final void m76356e(View view) {
        v90.m197523a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m76357f() {
        AnimatorSet animatorSet = this.f51834k;
        if (animatorSet != null) {
            dt0.m113503C(animatorSet);
        }
        this.f51824a.setBackgroundResource(0);
        bk40.m102265e(this.f51832i, this.f51833j);
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m76358g(long j) {
        if (j < 10) {
            return m76355i(h1c0.f105315J0);
        }
        if (j < 20) {
            return m76355i(h1c0.f105307F0);
        }
        return j < 30 ? m76355i(h1c0.f105422z0) : m76355i(h1c0.f105315J0);
    }

    public String getUid() {
        BLiveEnterRoom bLiveEnterRoom = this.f51831h;
        if (bLiveEnterRoom != null) {
            return bLiveEnterRoom.uid;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m76359j() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m76360k(File file, BLiveEnterRoom bLiveEnterRoom) {
        this.f51832i = bk40.m102268h(this.f51824a, file);
        m76372w(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m76361l(File file, BLiveEnterRoom bLiveEnterRoom) {
        this.f51824a.setBackgroundResource(0);
        this.f51832i = bk40.m102268h(this.f51824a, file);
        m76372w(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76362m(final BLiveEnterRoom bLiveEnterRoom, final File file) {
        e51.m114742G(new Runnable() { // from class: l.u90
            @Override // java.lang.Runnable
            public final void run() {
                this.f175184a.m76361l(file, bLiveEnterRoom);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m76363n() {
        this.f51824a.setBackgroundResource(i3c0.f110698F0);
    }

    /* JADX INFO: renamed from: o */
    public void m76364o() {
        this.f51830g.setImageResource(0);
        xdl0.m208345M0(this.f51830g, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76356e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m76365p(BLiveEnterRoom bLiveEnterRoom) {
        hxs.m133399l("context_livingAct", this.f51830g, bLiveEnterRoom.floatBgUrl, 1);
    }

    /* JADX INFO: renamed from: q */
    public final void m76366q(BLiveEnterRoom bLiveEnterRoom) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveEnterRoom.userImage);
        VDraweeView vDraweeView = this.f51827d;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f51826c, false);
            return;
        }
        hxs.m133406s("context_livingAct", vDraweeView, bLiveEnterRoom.userImage);
        if (vwb.m200296J(bLiveEnterRoom.avatarGradients) || bLiveEnterRoom.avatarGradients.size() <= 1) {
            xdl0.m208344M(this.f51826c, false);
        } else {
            xdl0.m208344M(this.f51826c, true);
            this.f51826c.setImageDrawable(m76354h(1, bLiveEnterRoom.avatarGradients, bLiveEnterRoom.avatarGradientDirection));
        }
        xdl0.m208344M(this.f51827d, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m76367r(BLiveEnterRoom bLiveEnterRoom) {
        if (!TextUtils.isEmpty(bLiveEnterRoom.bgUrl)) {
            m76370u(bLiveEnterRoom);
        } else if (vwb.m200296J(bLiveEnterRoom.backgroundGradients) || bLiveEnterRoom.backgroundGradients.size() <= 1) {
            this.f51824a.setBackgroundResource(i3c0.f110698F0);
        } else {
            this.f51824a.setBackground(m76354h(0, bLiveEnterRoom.backgroundGradients, bLiveEnterRoom.backgroundGradientDirection));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m76368s(BLiveEnterRoom bLiveEnterRoom) {
        this.f51824a.setBackground(null);
        this.f51824a.setController(null);
        this.f51829f.setPadding(0, 0, 0, 0);
        if (!TextUtils.isEmpty(bLiveEnterRoom.userGradeIcon)) {
            sxj.m186442c(bLiveEnterRoom.userGradeIcon, this.f51825b, sxj.f166797a);
        }
        xdl0.m208344M(this.f51825b, !TextUtils.isEmpty(bLiveEnterRoom.userGradeIcon));
        rfd0.m179126b(this.f51828e, bLiveEnterRoom.userName, kvc0.m147358g(bLiveEnterRoom.userNameColor), bLiveEnterRoom.userNameGradientColors);
        this.f51829f.setText(bLiveEnterRoom.getContentText(getContext()));
        this.f51829f.setTextColor(kvc0.m147358g(bLiveEnterRoom.contentTextColor));
    }

    public void setAnim(AnimatorSet animatorSet) {
        this.f51834k = animatorSet;
    }

    /* JADX INFO: renamed from: t */
    public void m76369t(BLiveEnterRoom bLiveEnterRoom) {
        this.f51831h = bLiveEnterRoom;
        bLiveEnterRoom.checkDefaultColor();
        m76368s(bLiveEnterRoom);
        m76367r(bLiveEnterRoom);
        m76366q(bLiveEnterRoom);
        if (TextUtils.isEmpty(bLiveEnterRoom.floatBgUrl)) {
            xdl0.m208345M0(this.f51830g, false);
        } else {
            m76365p(bLiveEnterRoom);
            xdl0.m208345M0(this.f51830g, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m76370u(final BLiveEnterRoom bLiveEnterRoom) {
        final File fileM102264d = bk40.m102264d(getContext(), bLiveEnterRoom.bgUrl);
        if (fileM102264d.exists()) {
            e51.m114742G(new Runnable() { // from class: l.r90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158268a.m76360k(fileM102264d, bLiveEnterRoom);
                }
            });
        } else {
            this.f51824a.setBackgroundResource(i3c0.f110698F0);
            this.f51833j = bk40.m102266f(bLiveEnterRoom.bgUrl, fileM102264d, new e30() { // from class: l.s90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163128a.m76362m(bLiveEnterRoom, (File) obj);
                }
            }, new d30() { // from class: l.t90
                @Override // p149l.d30
                public final void call() {
                    this.f168978a.m76363n();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public void m76371v(BLiveEnterRoom bLiveEnterRoom) {
        this.f51831h = bLiveEnterRoom;
        sxj.m186442c(bLiveEnterRoom.userGradeIcon, this.f51825b, bLiveEnterRoom.userGrade >= 42 ? sxj.f166798b : sxj.f166797a);
        rfd0.m179126b(this.f51828e, bLiveEnterRoom.userName, kvc0.m147358g(bLiveEnterRoom.userNameColor), bLiveEnterRoom.userNameGradientColors);
        this.f51829f.setText(R$string.f47292i2);
        this.f51829f.setTextColor(-1);
        xdl0.m208344M(this.f51827d, false);
        xdl0.m208344M(this.f51826c, false);
        this.f51824a.setBackground(m76358g(bLiveEnterRoom.userGrade));
        xdl0.m208345M0(this.f51830g, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m76372w(BLiveEnterRoom bLiveEnterRoom) {
        if (this.f51824a.getBackground() instanceof NinePatchDrawable) {
            this.f51829f.setPadding(0, 0, Math.max(0, t100.m186890d(bLiveEnterRoom.backgroundUrlEndMargin)), 0);
        }
    }

    public AdmissionMessageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdmissionMessageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
