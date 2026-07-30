package p149l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.view.MarryEditProfileItemView;
import com.p046p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class byw extends iww<zxw> {

    /* JADX INFO: renamed from: c */
    public VScroll f77973c;

    /* JADX INFO: renamed from: d */
    public VText f77974d;

    /* JADX INFO: renamed from: e */
    public VText f77975e;

    /* JADX INFO: renamed from: f */
    public MarryEditProfileItemView f77976f;

    /* JADX INFO: renamed from: g */
    public MarryEditProfileItemView f77977g;

    /* JADX INFO: renamed from: h */
    public MarryEditProfileItemView f77978h;

    /* JADX INFO: renamed from: i */
    public MarryEditProfileItemView f77979i;

    /* JADX INFO: renamed from: j */
    public MarryEditProfileItemView f77980j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileItemView f77981k;

    /* JADX INFO: renamed from: l */
    public VLinear f77982l;

    /* JADX INFO: renamed from: m */
    public VEditText f77983m;

    /* JADX INFO: renamed from: n */
    public TextView f77984n;

    /* JADX INFO: renamed from: o */
    public VLinear f77985o;

    /* JADX INFO: renamed from: p */
    public zxw f77986p;

    /* JADX INFO: renamed from: q */
    public List<wvl> f77987q;

    /* JADX INFO: renamed from: l.byw$a */
    public class C16018a implements clf0.InterfaceC16186a {
        public C16018a() {
        }

        @Override // p149l.clf0.InterfaceC16186a
        /* JADX INFO: renamed from: a */
        public void mo104524a(int i) {
            byw.this.f77973c.fullScroll(33);
        }

        @Override // p149l.clf0.InterfaceC16186a
        /* JADX INFO: renamed from: b */
        public void mo104525b(int i) {
            byw.this.f77973c.fullScroll(130);
        }
    }

    public byw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m104514p(wvl wvlVar, View view) {
        act().startActivityForResult(MarryEditProfileSeriesAct.m47452Y1(act(), this.f77986p.f205564a, vwb.m200324f0(wvlVar.getItemType()), false, false, true), 5002);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: b */
    public boolean mo104515b(MarrySeriesType marrySeriesType, User user) {
        if (!NullChecker.m81303a(this.f77983m.getText()) || this.f77983m.getText().length() >= 20) {
            return true;
        }
        osi0.m165783g("请至少填写20个字");
        return false;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        ProfileExtensionMarriage profileExtensionMarriage = user.profile.extensions.marriage;
        ProfileExtensionMarriage profileExtensionMarriage2 = this.f77986p.f205564a.profile.extensions.marriage;
        profileExtensionMarriage.mateStatus = profileExtensionMarriage2.mateStatus;
        profileExtensionMarriage.mateQualification = profileExtensionMarriage2.mateQualification;
        profileExtensionMarriage.mateIncome = profileExtensionMarriage2.mateIncome;
        profileExtensionMarriage.mateAddress = profileExtensionMarriage2.mateAddress;
        profileExtensionMarriage.mateAge = profileExtensionMarriage2.mateAge;
        profileExtensionMarriage.mateHeight = profileExtensionMarriage2.mateHeight;
        profileExtensionMarriage.mateDescription = vwb.m200324f0(this.f77983m.getText().toString().trim());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        this.f77974d.setTypeface(eqh0.m117752c(3), 1);
        this.f77975e.setText(String.format("关于理想伴侣，我希望%s...\n(预期过高，可能无法匹配到合适的人)", user.isFemale() ? "他" : "她"));
        this.f77983m.setHint(String.format("我希望%s...", user.isFemale() ? "他" : "她"));
        ArrayList arrayList = new ArrayList();
        this.f77987q = arrayList;
        arrayList.add(this.f77976f.m47551h0(MarrySeriesType.MATE_STATUS));
        this.f77987q.add(this.f77977g.m47551h0(MarrySeriesType.MATE_AGE));
        this.f77987q.add(this.f77978h.m47551h0(MarrySeriesType.MATE_QUALIFICATIONS));
        this.f77987q.add(this.f77979i.m47551h0(MarrySeriesType.MATE_HEIGHT));
        this.f77987q.add(this.f77980j.m47551h0(MarrySeriesType.MATE_INCOME));
        this.f77987q.add(this.f77981k.m47551h0(MarrySeriesType.MATE_ADDRESS));
        for (final wvl wvlVar : this.f77987q) {
            if (wvlVar.mo47526f()) {
                xdl0.m208329E0(wvlVar.getClickView(), new View.OnClickListener() { // from class: l.ayw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f72311a.m104514p(wvlVar, view);
                    }
                });
            }
        }
        clf0.m107459c(this.f77973c, new C16018a());
        this.f77983m.addTextChangedListener(new C16019b());
        m104522q(true, this.f77986p.f205564a);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104519l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m104519l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cyw.m109393b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zxw zxwVar) {
        this.f77986p = zxwVar;
    }

    /* JADX INFO: renamed from: n */
    public String m104521n() {
        return this.f77983m.getText().toString();
    }

    /* JADX INFO: renamed from: q */
    public void m104522q(boolean z, User user) {
        Iterator<wvl> it = this.f77987q.iterator();
        while (it.hasNext()) {
            it.next().mo47525d(user);
        }
        if (z) {
            this.f77983m.setText(user.profile.extensions.marriage.mateDescription.get(0));
            VEditText vEditText = this.f77983m;
            vEditText.setSelection(vEditText.getText().length());
            m104523s(user.profile.extensions.marriage.mateDescription.get(0));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m104523s(String str) {
        if (str == null) {
            str = "";
        }
        this.f77984n.setText(String.valueOf(300 - str.length()));
    }

    /* JADX INFO: renamed from: l.byw$b */
    public class C16019b implements TextWatcher {
        public C16019b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            byw.this.m104523s(editable == null ? null : String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
