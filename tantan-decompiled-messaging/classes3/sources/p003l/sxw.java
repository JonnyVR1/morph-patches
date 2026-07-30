package p003l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.profile.views.WheelPicker;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.txw;
import l.vwb;
import org.spongycastle.crypto.tls.CipherSuite;
import p028v.VFrame;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sxw extends iww<oxw> {

    /* JADX INFO: renamed from: c */
    public VLinear f7361c;

    /* JADX INFO: renamed from: d */
    public VText f7362d;

    /* JADX INFO: renamed from: e */
    public VFrame f7363e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f7364f;

    /* JADX INFO: renamed from: g */
    public WheelPicker f7365g;

    /* JADX INFO: renamed from: h */
    public oxw f7366h;

    /* JADX INFO: renamed from: l.sxw$a */
    public static /* synthetic */ class C0542a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7367a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f7367a = iArr;
            try {
                iArr[MarrySeriesType.MATE_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7367a[MarrySeriesType.MATE_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public sxw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayListF0 = vwb.f0(new String[]{m2x.m6210q(this.f7366h.f6282a), m2x.m6210q(this.f7366h.f6283b)});
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            user.profile.extensions.marriage.mateAge = arrayListF0;
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            user.profile.extensions.marriage.mateHeight = arrayListF0;
        }
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(final MarrySeriesType marrySeriesType, User user) {
        List<String> listM6209p;
        List<String> listM6209p2;
        this.f7362d.setTypeface(eqh0.m3924c(3), 1);
        this.f7362d.setText(marrySeriesType.getTitleName());
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            listM6209p = m2x.m6207n(String.valueOf(18), false);
            listM6209p2 = m2x.m6207n(this.f7366h.f6282a, true);
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            listM6209p = m2x.m6209p(String.valueOf(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), true);
            listM6209p2 = m2x.m6209p(this.f7366h.f6282a, true);
        } else {
            listM6209p = null;
            listM6209p2 = null;
        }
        this.f7364f.setData(listM6209p);
        this.f7365g.setData(listM6209p2);
        this.f7364f.setSelectedItemPosition(listM6209p.indexOf(this.f7366h.f6282a));
        this.f7365g.setSelectedItemPosition(listM6209p2.indexOf(this.f7366h.f6283b));
        this.f7364f.setOnItemSelectedListener(new WheelPicker.a() { // from class: l.pxw
            /* JADX INFO: renamed from: a */
            public final void m6968a(WheelPicker wheelPicker, Object obj, int i) {
                this.f6552a.m7656s(marrySeriesType, wheelPicker, obj, i);
            }
        });
        this.f7365g.setOnItemSelectedListener(new WheelPicker.a() { // from class: l.qxw
            /* JADX INFO: renamed from: a */
            public final void m7069a(WheelPicker wheelPicker, Object obj, int i) {
                this.f6722a.m7657u(wheelPicker, obj, i);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7652m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m7652m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return txw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m7651i1(oxw oxwVar) {
        this.f7366h = oxwVar;
    }

    /* JADX INFO: renamed from: p */
    public final List<String> m7654p(MarrySeriesType marrySeriesType, String str, boolean z) {
        int i = C0542a.f7367a[marrySeriesType.ordinal()];
        if (i == 1) {
            return m2x.m6207n(str, z);
        }
        if (i != 2) {
            return null;
        }
        return m2x.m6209p(str, z);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m7655q(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f7366h.f6283b));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7656s(MarrySeriesType marrySeriesType, WheelPicker wheelPicker, Object obj, int i) {
        String str = (String) obj;
        this.f7366h.f6282a = str;
        try {
            List<String> listM7654p = m7654p(marrySeriesType, str, true);
            if (vwb.J(listM7654p)) {
                return;
            }
            this.f7365g.setData(listM7654p);
            int iG = Integer.parseInt(this.f7366h.f6282a) <= Integer.parseInt(this.f7366h.f6283b) ? vwb.G(listM7654p, new w9j() { // from class: l.rxw
                @Override // p003l.w9j
                public final Object call(Object obj2) {
                    return this.f7113a.m7655q((String) obj2);
                }
            }) : 0;
            this.f7365g.m(iG, false);
            this.f7366h.f6283b = listM7654p.get(iG);
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m7657u(WheelPicker wheelPicker, Object obj, int i) {
        this.f7366h.f6283b = (String) obj;
    }
}
