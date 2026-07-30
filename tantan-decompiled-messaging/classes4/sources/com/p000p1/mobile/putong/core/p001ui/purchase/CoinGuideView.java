package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import l.b1c0;
import l.d3c0;
import l.eqh0;
import l.fc5;
import l.i0g0;
import l.j17;
import l.l7n;
import l.swh0;
import l.t100;
import l.xdl0;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CoinGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public GradientBgButton f2162a;

    /* JADX INFO: renamed from: b */
    public ImageView f2163b;

    /* JADX INFO: renamed from: c */
    public VText f2164c;

    /* JADX INFO: renamed from: d */
    public VText f2165d;

    /* JADX INFO: renamed from: e */
    public VText f2166e;

    /* JADX INFO: renamed from: f */
    public VCheckBox f2167f;

    /* JADX INFO: renamed from: g */
    public VText f2168g;

    /* JADX INFO: renamed from: h */
    public int f2169h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.CoinGuideView$a */
    public static /* synthetic */ class C0179a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2170a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f2170a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP_SUPERLIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2170a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2170a[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2170a[PurchaseType.TYPE_GET_LETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2170a[PurchaseType.TYPE_GET_LETTER_INTL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2170a[PurchaseType.TYPE_GET_SEE_LETTER_INTL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2170a[PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CoinGuideView(Context context) {
        super(context);
        this.f2169h = 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m3659h(View view) {
        fc5.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final Act m3660i() {
        return getContext();
    }

    /* JADX INFO: renamed from: j */
    public void m3661j(PurchaseType purchaseType) {
        int iU0;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        boolean zU;
        boolean zD0;
        String strString;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        String str = null;
        switch (C0179a.f2170a[purchaseType.ordinal()]) {
            case 1:
                iU0 = swh0.u0();
                boolean zK1 = swh0.p0().K1();
                String strString2 = m3660i().string(l7n.f());
                this.f2164c.setText(R.string.d);
                this.f2163b.setImageDrawable(m3660i().drawable(d3c0.u9));
                this.f2162a.setButtonColorStart(m3660i().color(b1c0.p0));
                this.f2162a.setButtonColorEnd(m3660i().color(b1c0.o0));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.yb5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().a1(z);
                    }
                };
                str = strString2;
                zU = zK1;
                break;
            case 2:
                iU0 = j17.z3();
                zU = swh0.p0().u();
                this.f2164c.setText(m3660i().string(R.string.o));
                this.f2163b.setImageDrawable(m3660i().drawable(d3c0.l));
                this.f2162a.setButtonColorStart(m3660i().color(b1c0.b));
                this.f2162a.setButtonColorEnd(m3660i().color(b1c0.a));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.zb5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().J0(z);
                    }
                };
                break;
            case 3:
                iU0 = CoreModule.c.H0.f5();
                zD0 = swh0.p0().D0();
                strString = m3660i().string(R.string.w);
                this.f2164c.setText(R.string.a7);
                ViewGroup.LayoutParams layoutParams = this.f2163b.getLayoutParams();
                int i = t100.z;
                layoutParams.width = i;
                this.f2163b.getLayoutParams().height = i;
                this.f2163b.setImageResource(d3c0.z0);
                this.f2162a.setButtonColorStart(Color.parseColor("#c267fa"));
                this.f2162a.setButtonColorEnd(Color.parseColor("#c267fa"));
                onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ac5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().Q0(z);
                    }
                };
                String str2 = strString;
                onCheckedChangeListener = onCheckedChangeListener2;
                zU = zD0;
                str = str2;
                break;
            case 4:
                iU0 = CoreModule.c.H0.X4();
                zU = swh0.p0().A0();
                this.f2164c.setText(R.string.M0);
                ViewGroup.LayoutParams layoutParams2 = this.f2163b.getLayoutParams();
                int i2 = t100.z;
                layoutParams2.width = i2;
                this.f2163b.getLayoutParams().height = i2;
                this.f2163b.setImageResource(d3c0.p8);
                this.f2162a.setButtonColorStart(m3660i().color(b1c0.Y));
                this.f2162a.setButtonColorEnd(m3660i().color(b1c0.X));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.bc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().O0(z);
                    }
                };
                break;
            case 5:
                iU0 = CoreModule.c.H0.X4();
                zU = swh0.p0().z0();
                this.f2164c.setText(R.string.M0);
                this.f2166e.setText(R.string.K2);
                ViewGroup.LayoutParams layoutParams3 = this.f2163b.getLayoutParams();
                int i3 = t100.z;
                layoutParams3.width = i3;
                this.f2163b.getLayoutParams().height = i3;
                this.f2163b.setImageResource(CoreModule.P().a().z6());
                this.f2162a.setButtonColorStart(m3660i().color(b1c0.Y));
                this.f2162a.setButtonColorEnd(m3660i().color(b1c0.X));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.cc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().L0(z);
                    }
                };
                break;
            case 6:
                iU0 = CoreModule.c.H0.X4();
                zU = swh0.p0().t0();
                this.f2164c.setText(R.string.M0);
                this.f2166e.setText(R.string.L2);
                ViewGroup.LayoutParams layoutParams4 = this.f2163b.getLayoutParams();
                int i4 = t100.z;
                layoutParams4.width = i4;
                this.f2163b.getLayoutParams().height = i4;
                this.f2163b.setImageResource(d3c0.ua);
                this.f2162a.setButtonColorStart(Color.parseColor("#ffa067"));
                this.f2162a.setButtonColorEnd(Color.parseColor("#ff3f45"));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.dc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().Q1(z);
                    }
                };
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                iU0 = CoreModule.c.H0.l4();
                zD0 = swh0.p0().R1();
                this.f2164c.setText("语音闪聊");
                ViewGroup.LayoutParams layoutParams5 = this.f2163b.getLayoutParams();
                int i5 = t100.z;
                layoutParams5.width = i5;
                this.f2163b.getLayoutParams().height = i5;
                this.f2163b.setImageResource(d3c0.z0);
                this.f2162a.setButtonColorStart(Color.parseColor("#c267fa"));
                this.f2162a.setButtonColorEnd(Color.parseColor("#c267fa"));
                onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ec5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.p0().b1(z);
                    }
                };
                strString = "语音闪聊用完了，可以用探探币购买更多";
                String str3 = strString;
                onCheckedChangeListener = onCheckedChangeListener2;
                zU = zD0;
                str = str3;
                break;
            default:
                iU0 = 0;
                zU = true;
                onCheckedChangeListener = null;
                break;
        }
        this.f2162a.setButtonColorAngle(90);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f2166e;
        if (zIsEmpty) {
            xdl0.M(vText, false);
        } else {
            vText.setText(str);
            xdl0.M(this.f2166e, true);
        }
        this.f2165d.setText(i0g0.N(m3660i().getString(R.string.S7, String.valueOf(iU0 * this.f2169h)), Color.parseColor("#ff5435"), eqh0.c(2)));
        this.f2168g.setText(R.string.O1);
        this.f2167f.setChecked(zU);
        this.f2167f.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3659h(this);
    }

    public void setPayCount(int i) {
        this.f2169h = i;
    }

    public CoinGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2169h = 1;
    }

    public CoinGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2169h = 1;
    }
}
