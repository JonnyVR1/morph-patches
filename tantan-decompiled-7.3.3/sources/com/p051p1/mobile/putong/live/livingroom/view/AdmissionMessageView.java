package com.p051p1.mobile.putong.live.livingroom.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.i0k;
import p153l.it0;
import p153l.izs;
import p153l.jyb;
import p153l.l51;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.ps40;
import p153l.qa00;
import p153l.r90;
import p153l.und0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class AdmissionMessageView extends FrameLayout {

    /* JADX INFO: renamed from: l */
    public static final float f52671l = qa00.f156321h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f52672a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52673b;

    /* JADX INFO: renamed from: c */
    public VImage f52674c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52675d;

    /* JADX INFO: renamed from: e */
    public LiveGradientTextView f52676e;

    /* JADX INFO: renamed from: f */
    public VText f52677f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52678g;

    /* JADX INFO: renamed from: h */
    public BLiveEnterRoom f52679h;

    /* JADX INFO: renamed from: i */
    public Bitmap f52680i;

    /* JADX INFO: renamed from: j */
    public DownloadTask f52681j;

    /* JADX INFO: renamed from: k */
    public AnimatorSet f52682k;

    public AdmissionMessageView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h */
    public static GradientDrawable m77537h(int i, List<String> list, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(f52671l);
        int[] iArr = new int[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            iArr[i3] = n3d0.m161284h(list.get(i3), n3d0.m161277a(n9c0.f140851o));
        }
        GradientDrawable.Orientation orientation = i2 == 1 ? GradientDrawable.Orientation.TOP_BOTTOM : (i2 != 2 && i2 == 3) ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT;
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m77538i(@ColorRes int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f52671l);
        gradientDrawable.setColor(n3d0.m161277a(i));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public final void m77539e(View view) {
        r90.m180289a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m77540f() {
        AnimatorSet animatorSet = this.f52682k;
        if (animatorSet != null) {
            it0.m142009C(animatorSet);
        }
        this.f52672a.setBackgroundResource(0);
        ps40.m173584e(this.f52680i, this.f52681j);
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m77541g(long j) {
        if (j < 10) {
            return m77538i(n9c0.f140776J0);
        }
        if (j < 20) {
            return m77538i(n9c0.f140768F0);
        }
        return j < 30 ? m77538i(n9c0.f140883z0) : m77538i(n9c0.f140776J0);
    }

    public String getUid() {
        BLiveEnterRoom bLiveEnterRoom = this.f52679h;
        if (bLiveEnterRoom != null) {
            return bLiveEnterRoom.uid;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m77542j() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m77543k(File file, BLiveEnterRoom bLiveEnterRoom) {
        this.f52680i = ps40.m173587h(this.f52672a, file);
        m77555w(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m77544l(File file, BLiveEnterRoom bLiveEnterRoom) {
        this.f52672a.setBackgroundResource(0);
        this.f52680i = ps40.m173587h(this.f52672a, file);
        m77555w(bLiveEnterRoom);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m77545m(final BLiveEnterRoom bLiveEnterRoom, final File file) {
        l51.m152887G(new Runnable() { // from class: l.q90
            @Override // java.lang.Runnable
            public final void run() {
                this.f156180a.m77544l(file, bLiveEnterRoom);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m77546n() {
        this.f52672a.setBackgroundResource(obc0.f146026F0);
    }

    /* JADX INFO: renamed from: o */
    public void m77547o() {
        this.f52678g.setImageResource(0);
        bnl0.m105525M0(this.f52678g, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77539e(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m77548p(BLiveEnterRoom bLiveEnterRoom) {
        izs.m142861l("context_livingAct", this.f52678g, bLiveEnterRoom.floatBgUrl, 1);
    }

    /* JADX INFO: renamed from: q */
    public final void m77549q(BLiveEnterRoom bLiveEnterRoom) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveEnterRoom.userImage);
        VDraweeView vDraweeView = this.f52675d;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f52674c, false);
            return;
        }
        izs.m142868s("context_livingAct", vDraweeView, bLiveEnterRoom.userImage);
        if (jyb.m147479J(bLiveEnterRoom.avatarGradients) || bLiveEnterRoom.avatarGradients.size() <= 1) {
            bnl0.m105524M(this.f52674c, false);
        } else {
            bnl0.m105524M(this.f52674c, true);
            this.f52674c.setImageDrawable(m77537h(1, bLiveEnterRoom.avatarGradients, bLiveEnterRoom.avatarGradientDirection));
        }
        bnl0.m105524M(this.f52675d, true);
    }

    /* JADX INFO: renamed from: r */
    public final void m77550r(BLiveEnterRoom bLiveEnterRoom) {
        if (!TextUtils.isEmpty(bLiveEnterRoom.bgUrl)) {
            m77553u(bLiveEnterRoom);
        } else if (jyb.m147479J(bLiveEnterRoom.backgroundGradients) || bLiveEnterRoom.backgroundGradients.size() <= 1) {
            this.f52672a.setBackgroundResource(obc0.f146026F0);
        } else {
            this.f52672a.setBackground(m77537h(0, bLiveEnterRoom.backgroundGradients, bLiveEnterRoom.backgroundGradientDirection));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m77551s(BLiveEnterRoom bLiveEnterRoom) {
        this.f52672a.setBackground(null);
        this.f52672a.setController(null);
        this.f52677f.setPadding(0, 0, 0, 0);
        if (!TextUtils.isEmpty(bLiveEnterRoom.userGradeIcon)) {
            i0k.m137976c(bLiveEnterRoom.userGradeIcon, this.f52673b, i0k.f112378a);
        }
        bnl0.m105524M(this.f52673b, !TextUtils.isEmpty(bLiveEnterRoom.userGradeIcon));
        und0.m196834b(this.f52676e, bLiveEnterRoom.userName, n3d0.m161283g(bLiveEnterRoom.userNameColor), bLiveEnterRoom.userNameGradientColors);
        this.f52677f.setText(bLiveEnterRoom.getContentText(getContext()));
        this.f52677f.setTextColor(n3d0.m161283g(bLiveEnterRoom.contentTextColor));
    }

    public void setAnim(AnimatorSet animatorSet) {
        this.f52682k = animatorSet;
    }

    /* JADX INFO: renamed from: t */
    public void m77552t(BLiveEnterRoom bLiveEnterRoom) {
        this.f52679h = bLiveEnterRoom;
        bLiveEnterRoom.checkDefaultColor();
        m77551s(bLiveEnterRoom);
        m77550r(bLiveEnterRoom);
        m77549q(bLiveEnterRoom);
        if (TextUtils.isEmpty(bLiveEnterRoom.floatBgUrl)) {
            bnl0.m105525M0(this.f52678g, false);
        } else {
            m77548p(bLiveEnterRoom);
            bnl0.m105525M0(this.f52678g, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m77553u(final BLiveEnterRoom bLiveEnterRoom) {
        final File fileM173583d = ps40.m173583d(getContext(), bLiveEnterRoom.bgUrl);
        if (fileM173583d.exists()) {
            l51.m152887G(new Runnable() { // from class: l.n90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140731a.m77543k(fileM173583d, bLiveEnterRoom);
                }
            });
        } else {
            this.f52672a.setBackgroundResource(obc0.f146026F0);
            this.f52681j = ps40.m173585f(bLiveEnterRoom.bgUrl, fileM173583d, new y20() { // from class: l.o90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145481a.m77545m(bLiveEnterRoom, (File) obj);
                }
            }, new x20() { // from class: l.p90
                @Override // p153l.x20
                public final void call() {
                    this.f151075a.m77546n();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public void m77554v(BLiveEnterRoom bLiveEnterRoom) {
        this.f52679h = bLiveEnterRoom;
        i0k.m137976c(bLiveEnterRoom.userGradeIcon, this.f52673b, bLiveEnterRoom.userGrade >= 42 ? i0k.f112379b : i0k.f112378a);
        und0.m196834b(this.f52676e, bLiveEnterRoom.userName, n3d0.m161283g(bLiveEnterRoom.userNameColor), bLiveEnterRoom.userNameGradientColors);
        this.f52677f.setText(R$string.f48140i2);
        this.f52677f.setTextColor(-1);
        bnl0.m105524M(this.f52675d, false);
        bnl0.m105524M(this.f52674c, false);
        this.f52672a.setBackground(m77541g(bLiveEnterRoom.userGrade));
        bnl0.m105525M0(this.f52678g, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m77555w(BLiveEnterRoom bLiveEnterRoom) {
        if (this.f52672a.getBackground() instanceof NinePatchDrawable) {
            this.f52677f.setPadding(0, 0, Math.max(0, qa00.m175859d(bLiveEnterRoom.backgroundUrlEndMargin)), 0);
        }
    }

    public AdmissionMessageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdmissionMessageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
