package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class sxw extends iww<oxw> {

    /* JADX INFO: renamed from: c */
    public VLinear f166832c;

    /* JADX INFO: renamed from: d */
    public VText f166833d;

    /* JADX INFO: renamed from: e */
    public VFrame f166834e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f166835f;

    /* JADX INFO: renamed from: g */
    public WheelPicker f166836g;

    /* JADX INFO: renamed from: h */
    public oxw f166837h;

    /* JADX INFO: renamed from: l.sxw$a */
    public static /* synthetic */ class C20067a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f166838a;

        static {
            int[] iArr = new int[MarrySeriesType.values().length];
            f166838a = iArr;
            try {
                iArr[MarrySeriesType.MATE_AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f166838a[MarrySeriesType.MATE_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public sxw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(m2x.m152735q(this.f166837h.f146257a), m2x.m152735q(this.f166837h.f146258b));
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            user.profile.extensions.marriage.mateAge = arrayListM200324f0;
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            user.profile.extensions.marriage.mateHeight = arrayListM200324f0;
        }
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(final MarrySeriesType marrySeriesType, User user) {
        List<String> listM152734p;
        List<String> listM152734p2;
        this.f166833d.setTypeface(eqh0.m117752c(3), 1);
        this.f166833d.setText(marrySeriesType.getTitleName());
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            listM152734p = m2x.m152732n(String.valueOf(18), false);
            listM152734p2 = m2x.m152732n(this.f166837h.f146257a, true);
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            listM152734p = m2x.m152734p(String.valueOf(140), true);
            listM152734p2 = m2x.m152734p(this.f166837h.f146257a, true);
        } else {
            listM152734p = null;
            listM152734p2 = null;
        }
        this.f166835f.setData(listM152734p);
        this.f166836g.setData(listM152734p2);
        this.f166835f.setSelectedItemPosition(listM152734p.indexOf(this.f166837h.f146257a));
        this.f166836g.setSelectedItemPosition(listM152734p2.indexOf(this.f166837h.f146258b));
        this.f166835f.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.pxw
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f151734a.m186554s(marrySeriesType, wheelPicker, obj, i);
            }
        });
        this.f166836g.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.qxw
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f156875a.m186555u(wheelPicker, obj, i);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186550m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m186550m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return txw.m190989b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oxw oxwVar) {
        this.f166837h = oxwVar;
    }

    /* JADX INFO: renamed from: p */
    public final List<String> m186552p(MarrySeriesType marrySeriesType, String str, boolean z) {
        int i = C20067a.f166838a[marrySeriesType.ordinal()];
        if (i == 1) {
            return m2x.m152732n(str, z);
        }
        if (i != 2) {
            return null;
        }
        return m2x.m152734p(str, z);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m186553q(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f166837h.f146258b));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m186554s(MarrySeriesType marrySeriesType, WheelPicker wheelPicker, Object obj, int i) {
        String str = (String) obj;
        this.f166837h.f146257a = str;
        try {
            List<String> listM186552p = m186552p(marrySeriesType, str, true);
            if (vwb.m200296J(listM186552p)) {
                return;
            }
            this.f166836g.setData(listM186552p);
            int iM200293G = Integer.parseInt(this.f166837h.f146257a) <= Integer.parseInt(this.f166837h.f146258b) ? vwb.m200293G(listM186552p, new w9j() { // from class: l.rxw
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return this.f161518a.m186553q((String) obj2);
                }
            }) : 0;
            this.f166836g.m53060m(iM200293G, false);
            this.f166837h.f146258b = listM186552p.get(iM200293G);
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m186555u(WheelPicker wheelPicker, Object obj, int i) {
        this.f166837h.f146258b = (String) obj;
    }
}
