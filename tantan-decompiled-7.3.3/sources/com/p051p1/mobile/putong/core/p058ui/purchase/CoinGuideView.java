package com.p051p1.mobile.putong.core.p058ui.purchase;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.pay.R$string;
import p151v.VCheckBox;
import p151v.VText;
import p153l.a5i0;
import p153l.bnl0;
import p153l.fd5;
import p153l.h9c0;
import p153l.jbc0;
import p153l.l9n;
import p153l.lyh0;
import p153l.m27;
import p153l.q8g0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class CoinGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public GradientBgButton f35188a;

    /* JADX INFO: renamed from: b */
    public ImageView f35189b;

    /* JADX INFO: renamed from: c */
    public VText f35190c;

    /* JADX INFO: renamed from: d */
    public VText f35191d;

    /* JADX INFO: renamed from: e */
    public VText f35192e;

    /* JADX INFO: renamed from: f */
    public VCheckBox f35193f;

    /* JADX INFO: renamed from: g */
    public VText f35194g;

    /* JADX INFO: renamed from: h */
    public int f35195h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.CoinGuideView$a */
    public static /* synthetic */ class C8917a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35196a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f35196a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP_SUPERLIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35196a[PurchaseType.TYPE_GET_BOOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35196a[PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35196a[PurchaseType.TYPE_GET_LETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35196a[PurchaseType.TYPE_GET_LETTER_INTL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35196a[PurchaseType.TYPE_GET_SEE_LETTER_INTL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35196a[PurchaseType.TYPE_GET_VOICE_ONLINE_MATCH_TICKETS_EXTRA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public CoinGuideView(Context context) {
        super(context);
        this.f35195h = 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m54276h(View view) {
        fd5.m125082a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final Act m54277i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public void m54278j(PurchaseType purchaseType) {
        int iM96172u0;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        boolean zM96226u;
        boolean zM96189D0;
        String strString;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2;
        String str = null;
        switch (C8917a.f35196a[purchaseType.ordinal()]) {
            case 1:
                iM96172u0 = a5i0.m96172u0();
                boolean zM96193K1 = a5i0.m96160p0().m96193K1();
                String strString2 = m54277i().string(l9n.m153441f());
                this.f35190c.setText(R$string.f28260d);
                this.f35189b.setImageDrawable(m54277i().drawable(jbc0.f119786u9));
                this.f35188a.setButtonColorStart(m54277i().color(h9c0.f108388p0));
                this.f35188a.setButtonColorEnd(m54277i().color(h9c0.f108386o0));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.yc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96212a1(z);
                    }
                };
                str = strString2;
                zM96226u = zM96193K1;
                break;
            case 2:
                iM96172u0 = m27.m156763z3();
                zM96226u = a5i0.m96160p0().m96226u();
                this.f35190c.setText(m54277i().string(R$string.f28392o));
                this.f35189b.setImageDrawable(m54277i().drawable(jbc0.f119650l));
                this.f35188a.setButtonColorStart(m54277i().color(h9c0.f108359b));
                this.f35188a.setButtonColorEnd(m54277i().color(h9c0.f108357a));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.zc5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96191J0(z);
                    }
                };
                break;
            case 3:
                iM96172u0 = CoreModule.f18264c.f20312H0.m155442f5();
                zM96189D0 = a5i0.m96160p0().m96189D0();
                strString = m54277i().string(R$string.f28482w);
                this.f35190c.setText(R$string.f28232a7);
                ViewGroup.LayoutParams layoutParams = this.f35189b.getLayoutParams();
                int i = qa00.f156339z;
                layoutParams.width = i;
                this.f35189b.getLayoutParams().height = i;
                this.f35189b.setImageResource(jbc0.f119847z0);
                this.f35188a.setButtonColorStart(Color.parseColor("#c267fa"));
                this.f35188a.setButtonColorEnd(Color.parseColor("#c267fa"));
                onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ad5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96200Q0(z);
                    }
                };
                String str2 = strString;
                onCheckedChangeListener = onCheckedChangeListener2;
                zM96226u = zM96189D0;
                str = str2;
                break;
            case 4:
                iM96172u0 = CoreModule.f18264c.f20312H0.m155434X4();
                zM96226u = a5i0.m96160p0().m96187A0();
                this.f35190c.setText(R$string.f28071M0);
                ViewGroup.LayoutParams layoutParams2 = this.f35189b.getLayoutParams();
                int i2 = qa00.f156339z;
                layoutParams2.width = i2;
                this.f35189b.getLayoutParams().height = i2;
                this.f35189b.setImageResource(jbc0.f119715p8);
                this.f35188a.setButtonColorStart(m54277i().color(h9c0.f108355Y));
                this.f35188a.setButtonColorEnd(m54277i().color(h9c0.f108354X));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.bd5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96197O0(z);
                    }
                };
                break;
            case 5:
                iM96172u0 = CoreModule.f18264c.f20312H0.m155434X4();
                zM96226u = a5i0.m96160p0().m96228z0();
                this.f35190c.setText(R$string.f28071M0);
                this.f35192e.setText(R$string.f28051K2);
                ViewGroup.LayoutParams layoutParams3 = this.f35189b.getLayoutParams();
                int i3 = qa00.f156339z;
                layoutParams3.width = i3;
                this.f35189b.getLayoutParams().height = i3;
                this.f35189b.setImageResource(CoreModule.m30933P().m143405a().mo34635z6());
                this.f35188a.setButtonColorStart(m54277i().color(h9c0.f108355Y));
                this.f35188a.setButtonColorEnd(m54277i().color(h9c0.f108354X));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.cd5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96194L0(z);
                    }
                };
                break;
            case 6:
                iM96172u0 = CoreModule.f18264c.f20312H0.m155434X4();
                zM96226u = a5i0.m96160p0().m96225t0();
                this.f35190c.setText(R$string.f28071M0);
                this.f35192e.setText(R$string.f28062L2);
                ViewGroup.LayoutParams layoutParams4 = this.f35189b.getLayoutParams();
                int i4 = qa00.f156339z;
                layoutParams4.width = i4;
                this.f35189b.getLayoutParams().height = i4;
                this.f35189b.setImageResource(jbc0.f119787ua);
                this.f35188a.setButtonColorStart(Color.parseColor("#ffa067"));
                this.f35188a.setButtonColorEnd(Color.parseColor("#ff3f45"));
                onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.dd5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96201Q1(z);
                    }
                };
                break;
            case 7:
                iM96172u0 = CoreModule.f18264c.f20312H0.m155450l4();
                zM96189D0 = a5i0.m96160p0().m96203R1();
                this.f35190c.setText("语音闪聊");
                ViewGroup.LayoutParams layoutParams5 = this.f35189b.getLayoutParams();
                int i5 = qa00.f156339z;
                layoutParams5.width = i5;
                this.f35189b.getLayoutParams().height = i5;
                this.f35189b.setImageResource(jbc0.f119847z0);
                this.f35188a.setButtonColorStart(Color.parseColor("#c267fa"));
                this.f35188a.setButtonColorEnd(Color.parseColor("#c267fa"));
                onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ed5
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        a5i0.m96160p0().m96213b1(z);
                    }
                };
                strString = "语音闪聊用完了，可以用探探币购买更多";
                String str3 = strString;
                onCheckedChangeListener = onCheckedChangeListener2;
                zM96226u = zM96189D0;
                str = str3;
                break;
            default:
                iM96172u0 = 0;
                zM96226u = true;
                onCheckedChangeListener = null;
                break;
        }
        this.f35188a.setButtonColorAngle(90);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f35192e;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            vText.setText(str);
            bnl0.m105524M(this.f35192e, true);
        }
        this.f35191d.setText(q8g0.m175782N(m54277i().getString(R$string.f28144S7, String.valueOf(iM96172u0 * this.f35195h)), Color.parseColor("#ff5435"), lyh0.m156283c(2)));
        this.f35194g.setText(R$string.f28094O1);
        this.f35193f.setChecked(zM96226u);
        this.f35193f.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54276h(this);
    }

    public void setPayCount(int i) {
        this.f35195h = i;
    }

    public CoinGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35195h = 1;
    }

    public CoinGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35195h = 1;
    }
}
