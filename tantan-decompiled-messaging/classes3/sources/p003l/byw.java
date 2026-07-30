package p003l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.view.MarryEditProfileItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.clf0;
import l.cyw;
import l.osi0;
import l.vwb;
import l.xdl0;
import p028v.VEditText;
import p028v.VLinear;
import p028v.VScroll;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class byw extends iww<zxw> {

    /* JADX INFO: renamed from: c */
    public VScroll f2539c;

    /* JADX INFO: renamed from: d */
    public VText f2540d;

    /* JADX INFO: renamed from: e */
    public VText f2541e;

    /* JADX INFO: renamed from: f */
    public MarryEditProfileItemView f2542f;

    /* JADX INFO: renamed from: g */
    public MarryEditProfileItemView f2543g;

    /* JADX INFO: renamed from: h */
    public MarryEditProfileItemView f2544h;

    /* JADX INFO: renamed from: i */
    public MarryEditProfileItemView f2545i;

    /* JADX INFO: renamed from: j */
    public MarryEditProfileItemView f2546j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileItemView f2547k;

    /* JADX INFO: renamed from: l */
    public VLinear f2548l;

    /* JADX INFO: renamed from: m */
    public VEditText f2549m;

    /* JADX INFO: renamed from: n */
    public TextView f2550n;

    /* JADX INFO: renamed from: o */
    public VLinear f2551o;

    /* JADX INFO: renamed from: p */
    public zxw f2552p;

    /* JADX INFO: renamed from: q */
    public List<wvl> f2553q;

    /* JADX INFO: renamed from: l.byw$a */
    public class C0191a implements clf0.a {
        public C0191a() {
        }

        /* JADX INFO: renamed from: a */
        public void m3217a(int i) {
            byw.this.f2539c.fullScroll(33);
        }

        /* JADX INFO: renamed from: b */
        public void m3218b(int i) {
            byw.this.f2539c.fullScroll(130);
        }
    }

    public byw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m3206p(wvl wvlVar, View view) {
        act().startActivityForResult(MarryEditProfileSeriesAct.m499Y1(act(), this.f2552p.f9501a, vwb.f0(new MarrySeriesType[]{wvlVar.getItemType()}), false, false, true), 5002);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo3207b(MarrySeriesType marrySeriesType, User user) {
        if (!NullChecker.a(this.f2549m.getText()) || this.f2549m.getText().length() >= 20) {
            return true;
        }
        osi0.g("请至少填写20个字");
        return false;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        ProfileExtensionMarriage profileExtensionMarriage = user.profile.extensions.marriage;
        ProfileExtensionMarriage profileExtensionMarriage2 = this.f2552p.f9501a.profile.extensions.marriage;
        profileExtensionMarriage.mateStatus = profileExtensionMarriage2.mateStatus;
        profileExtensionMarriage.mateQualification = profileExtensionMarriage2.mateQualification;
        profileExtensionMarriage.mateIncome = profileExtensionMarriage2.mateIncome;
        profileExtensionMarriage.mateAddress = profileExtensionMarriage2.mateAddress;
        profileExtensionMarriage.mateAge = profileExtensionMarriage2.mateAge;
        profileExtensionMarriage.mateHeight = profileExtensionMarriage2.mateHeight;
        profileExtensionMarriage.mateDescription = vwb.f0(new String[]{this.f2549m.getText().toString().trim()});
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        this.f2540d.setTypeface(eqh0.m3924c(3), 1);
        this.f2541e.setText(String.format("关于理想伴侣，我希望%s...\n(预期过高，可能无法匹配到合适的人)", user.isFemale() ? "他" : "她"));
        this.f2549m.setHint(String.format("我希望%s...", user.isFemale() ? "他" : "她"));
        ArrayList arrayList = new ArrayList();
        this.f2553q = arrayList;
        arrayList.add(this.f2542f.m603h0(MarrySeriesType.MATE_STATUS));
        this.f2553q.add(this.f2543g.m603h0(MarrySeriesType.MATE_AGE));
        this.f2553q.add(this.f2544h.m603h0(MarrySeriesType.MATE_QUALIFICATIONS));
        this.f2553q.add(this.f2545i.m603h0(MarrySeriesType.MATE_HEIGHT));
        this.f2553q.add(this.f2546j.m603h0(MarrySeriesType.MATE_INCOME));
        this.f2553q.add(this.f2547k.m603h0(MarrySeriesType.MATE_ADDRESS));
        for (final wvl wvlVar : this.f2553q) {
            if (wvlVar.mo576f()) {
                xdl0.E0(wvlVar.getClickView(), new View.OnClickListener() { // from class: l.ayw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f2325a.m3206p(wvlVar, view);
                    }
                });
            }
        }
        clf0.c(this.f2539c, new C0191a());
        this.f2549m.addTextChangedListener(new C0192b());
        m3215q(true, this.f2552p.f9501a);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3212l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m3212l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cyw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m3211i1(zxw zxwVar) {
        this.f2552p = zxwVar;
    }

    /* JADX INFO: renamed from: n */
    public String m3214n() {
        return this.f2549m.getText().toString();
    }

    /* JADX INFO: renamed from: q */
    public void m3215q(boolean z, User user) {
        Iterator<wvl> it = this.f2553q.iterator();
        while (it.hasNext()) {
            it.next().mo575d(user);
        }
        if (z) {
            this.f2549m.setText((CharSequence) user.profile.extensions.marriage.mateDescription.get(0));
            VEditText vEditText = this.f2549m;
            vEditText.setSelection(vEditText.getText().length());
            m3216s((String) user.profile.extensions.marriage.mateDescription.get(0));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3216s(String str) {
        if (str == null) {
            str = "";
        }
        this.f2550n.setText(String.valueOf(300 - str.length()));
    }

    /* JADX INFO: renamed from: l.byw$b */
    public class C0192b implements TextWatcher {
        public C0192b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            byw.this.m3216s(editable == null ? null : String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
