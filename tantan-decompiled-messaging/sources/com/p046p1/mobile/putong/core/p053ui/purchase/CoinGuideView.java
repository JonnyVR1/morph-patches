package com.p046p1.mobile.putong.core.p053ui.purchase;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.pay.R$string;
import p147v.VCheckBox;
import p147v.VText;
import p149l.b1c0;
import p149l.d3c0;
import p149l.eqh0;
import p149l.fc5;
import p149l.i0g0;
import p149l.j17;
import p149l.l7n;
import p149l.swh0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class CoinGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public GradientBgButton f34340a;

    /* JADX INFO: renamed from: b */
    public ImageView f34341b;

    /* JADX INFO: renamed from: c */
    public VText f34342c;

    /* JADX INFO: renamed from: d */
    public VText f34343d;

    /* JADX INFO: renamed from: e */
    public VText f34344e;

    /* JADX INFO: renamed from: f */
    public VCheckBox f34345f;

    /* JADX INFO: renamed from: g */
    public VText f34346g;

    /* JADX INFO: renamed from: h */
    public int f34347h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.CoinGuideView$a */
    public static /* synthetic */ class C8754a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34348a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f34348a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP_SUPERLIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34348a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34348a[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34348a[PurchaseType.TYPE_GET_LETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34348a[PurchaseType.TYPE_GET_LETTER_INTL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34348a[PurchaseType.TYPE_GET_SEE_LETTER_INTL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34348a[PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CoinGuideView(Context context) {
        super(context);
        this.f34347h = 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m53093h(View view) {
        fc5.m120420a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final Act m53094i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public void m53095j(PurchaseType purchaseType) {
        int iM186267u0;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        boolean zM186321u;
        boolean zM186284D0;
        String strString;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        String str = null;
        switch (C8754a.f34348a[purchaseType.ordinal()]) {
            case 1:
                iM186267u0 = swh0.m186267u0();
                boolean zM186288K1 = swh0.m186255p0().m186288K1();
                String strString2 = m53094i().string(l7n.m148818f());
                this.f34342c.setText(R$string.f27412d);
                this.f34341b.setImageDrawable(m53094i().drawable(d3c0.f84131u9));
                this.f34340a.setButtonColorStart(m53094i().color(b1c0.f72568p0));
                this.f34340a.setButtonColorEnd(m53094i().color(b1c0.f72566o0));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.yb5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186307a1(z);
                    }
                };
                str = strString2;
                zM186321u = zM186288K1;
                break;
            case 2:
                iM186267u0 = j17.m139251z3();
                zM186321u = swh0.m186255p0().m186321u();
                this.f34342c.setText(m53094i().string(R$string.f27544o));
                this.f34341b.setImageDrawable(m53094i().drawable(d3c0.f83995l));
                this.f34340a.setButtonColorStart(m53094i().color(b1c0.f72539b));
                this.f34340a.setButtonColorEnd(m53094i().color(b1c0.f72537a));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.zb5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186286J0(z);
                    }
                };
                break;
            case 3:
                iM186267u0 = CoreModule.f17545c.f19570H0.m210354f5();
                zM186284D0 = swh0.m186255p0().m186284D0();
                strString = m53094i().string(R$string.f27634w);
                this.f34342c.setText(R$string.f27384a7);
                ViewGroup.LayoutParams layoutParams = this.f34341b.getLayoutParams();
                int i = t100.f167277z;
                layoutParams.width = i;
                this.f34341b.getLayoutParams().height = i;
                this.f34341b.setImageResource(d3c0.f84192z0);
                this.f34340a.setButtonColorStart(Color.parseColor("#c267fa"));
                this.f34340a.setButtonColorEnd(Color.parseColor("#c267fa"));
                onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ac5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186295Q0(z);
                    }
                };
                String str2 = strString;
                onCheckedChangeListener = onCheckedChangeListener2;
                zM186321u = zM186284D0;
                str = str2;
                break;
            case 4:
                iM186267u0 = CoreModule.f17545c.f19570H0.m210346X4();
                zM186321u = swh0.m186255p0().m186282A0();
                this.f34342c.setText(R$string.f27223M0);
                ViewGroup.LayoutParams layoutParams2 = this.f34341b.getLayoutParams();
                int i2 = t100.f167277z;
                layoutParams2.width = i2;
                this.f34341b.getLayoutParams().height = i2;
                this.f34341b.setImageResource(d3c0.f84060p8);
                this.f34340a.setButtonColorStart(m53094i().color(b1c0.f72535Y));
                this.f34340a.setButtonColorEnd(m53094i().color(b1c0.f72534X));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.bc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186292O0(z);
                    }
                };
                break;
            case 5:
                iM186267u0 = CoreModule.f17545c.f19570H0.m210346X4();
                zM186321u = swh0.m186255p0().m186323z0();
                this.f34342c.setText(R$string.f27223M0);
                this.f34344e.setText(R$string.f27203K2);
                ViewGroup.LayoutParams layoutParams3 = this.f34341b.getLayoutParams();
                int i3 = t100.f167277z;
                layoutParams3.width = i3;
                this.f34341b.getLayoutParams().height = i3;
                this.f34341b.setImageResource(CoreModule.m29935P().m94651a().mo33632z6());
                this.f34340a.setButtonColorStart(m53094i().color(b1c0.f72535Y));
                this.f34340a.setButtonColorEnd(m53094i().color(b1c0.f72534X));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.cc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186289L0(z);
                    }
                };
                break;
            case 6:
                iM186267u0 = CoreModule.f17545c.f19570H0.m210346X4();
                zM186321u = swh0.m186255p0().m186320t0();
                this.f34342c.setText(R$string.f27223M0);
                this.f34344e.setText(R$string.f27214L2);
                ViewGroup.LayoutParams layoutParams4 = this.f34341b.getLayoutParams();
                int i4 = t100.f167277z;
                layoutParams4.width = i4;
                this.f34341b.getLayoutParams().height = i4;
                this.f34341b.setImageResource(d3c0.f84132ua);
                this.f34340a.setButtonColorStart(Color.parseColor("#ffa067"));
                this.f34340a.setButtonColorEnd(Color.parseColor("#ff3f45"));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.dc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186296Q1(z);
                    }
                };
                break;
            case 7:
                iM186267u0 = CoreModule.f17545c.f19570H0.m210362l4();
                zM186284D0 = swh0.m186255p0().m186298R1();
                this.f34342c.setText("语音闪聊");
                ViewGroup.LayoutParams layoutParams5 = this.f34341b.getLayoutParams();
                int i5 = t100.f167277z;
                layoutParams5.width = i5;
                this.f34341b.getLayoutParams().height = i5;
                this.f34341b.setImageResource(d3c0.f84192z0);
                this.f34340a.setButtonColorStart(Color.parseColor("#c267fa"));
                this.f34340a.setButtonColorEnd(Color.parseColor("#c267fa"));
                onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ec5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        swh0.m186255p0().m186308b1(z);
                    }
                };
                strString = "语音闪聊用完了，可以用探探币购买更多";
                String str3 = strString;
                onCheckedChangeListener = onCheckedChangeListener2;
                zM186321u = zM186284D0;
                str = str3;
                break;
            default:
                iM186267u0 = 0;
                zM186321u = true;
                onCheckedChangeListener = null;
                break;
        }
        this.f34340a.setButtonColorAngle(90);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f34344e;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            vText.setText(str);
            xdl0.m208344M(this.f34344e, true);
        }
        this.f34343d.setText(i0g0.m133847N(m53094i().getString(R$string.f27296S7, String.valueOf(iM186267u0 * this.f34347h)), Color.parseColor("#ff5435"), eqh0.m117752c(2)));
        this.f34346g.setText(R$string.f27246O1);
        this.f34345f.setChecked(zM186321u);
        this.f34345f.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53093h(this);
    }

    public void setPayCount(int i) {
        this.f34347h = i;
    }

    public CoinGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34347h = 1;
    }

    public CoinGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34347h = 1;
    }
}
