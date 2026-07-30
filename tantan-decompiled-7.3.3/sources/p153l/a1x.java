package p153l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.view.MarryEditProfileItemView;
import com.p051p1.mobile.putong.data.ProfileExtensionMarriage;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class a1x extends hzw<y0x> {

    /* JADX INFO: renamed from: c */
    public VScroll f67888c;

    /* JADX INFO: renamed from: d */
    public VText f67889d;

    /* JADX INFO: renamed from: e */
    public VText f67890e;

    /* JADX INFO: renamed from: f */
    public MarryEditProfileItemView f67891f;

    /* JADX INFO: renamed from: g */
    public MarryEditProfileItemView f67892g;

    /* JADX INFO: renamed from: h */
    public MarryEditProfileItemView f67893h;

    /* JADX INFO: renamed from: i */
    public MarryEditProfileItemView f67894i;

    /* JADX INFO: renamed from: j */
    public MarryEditProfileItemView f67895j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileItemView f67896k;

    /* JADX INFO: renamed from: l */
    public VLinear f67897l;

    /* JADX INFO: renamed from: m */
    public VEditText f67898m;

    /* JADX INFO: renamed from: n */
    public TextView f67899n;

    /* JADX INFO: renamed from: o */
    public VLinear f67900o;

    /* JADX INFO: renamed from: p */
    public y0x f67901p;

    /* JADX INFO: renamed from: q */
    public List<oyl> f67902q;

    /* JADX INFO: renamed from: l.a1x$a */
    public class C15620a implements ltf0.InterfaceC18459a {
        public C15620a() {
        }

        @Override // p153l.ltf0.InterfaceC18459a
        /* JADX INFO: renamed from: a */
        public void mo95584a(int i) {
            a1x.this.f67888c.fullScroll(33);
        }

        @Override // p153l.ltf0.InterfaceC18459a
        /* JADX INFO: renamed from: b */
        public void mo95585b(int i) {
            a1x.this.f67888c.fullScroll(130);
        }
    }

    public a1x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m95574p(oyl oylVar, View view) {
        act().startActivityForResult(MarryEditProfileSeriesAct.m48635Z1(act(), this.f67901p.f197059a, jyb.m147507f0(oylVar.getItemType()), false, false, true), 5002);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: b */
    public boolean mo95575b(MarrySeriesType marrySeriesType, User user) {
        if (!NullChecker.m82486a(this.f67898m.getText()) || this.f67898m.getText().length() >= 20) {
            return true;
        }
        r1j0.m179420g("请至少填写20个字");
        return false;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return true;
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        ProfileExtensionMarriage profileExtensionMarriage = user.profile.extensions.marriage;
        ProfileExtensionMarriage profileExtensionMarriage2 = this.f67901p.f197059a.profile.extensions.marriage;
        profileExtensionMarriage.mateStatus = profileExtensionMarriage2.mateStatus;
        profileExtensionMarriage.mateQualification = profileExtensionMarriage2.mateQualification;
        profileExtensionMarriage.mateIncome = profileExtensionMarriage2.mateIncome;
        profileExtensionMarriage.mateAddress = profileExtensionMarriage2.mateAddress;
        profileExtensionMarriage.mateAge = profileExtensionMarriage2.mateAge;
        profileExtensionMarriage.mateHeight = profileExtensionMarriage2.mateHeight;
        profileExtensionMarriage.mateDescription = jyb.m147507f0(this.f67898m.getText().toString().trim());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        this.f67889d.setTypeface(lyh0.m156283c(3), 1);
        this.f67890e.setText(String.format("关于理想伴侣，我希望%s...\n(预期过高，可能无法匹配到合适的人)", user.isFemale() ? "他" : "她"));
        this.f67898m.setHint(String.format("我希望%s...", user.isFemale() ? "他" : "她"));
        ArrayList arrayList = new ArrayList();
        this.f67902q = arrayList;
        arrayList.add(this.f67891f.m48734h0(MarrySeriesType.MATE_STATUS));
        this.f67902q.add(this.f67892g.m48734h0(MarrySeriesType.MATE_AGE));
        this.f67902q.add(this.f67893h.m48734h0(MarrySeriesType.MATE_QUALIFICATIONS));
        this.f67902q.add(this.f67894i.m48734h0(MarrySeriesType.MATE_HEIGHT));
        this.f67902q.add(this.f67895j.m48734h0(MarrySeriesType.MATE_INCOME));
        this.f67902q.add(this.f67896k.m48734h0(MarrySeriesType.MATE_ADDRESS));
        for (final oyl oylVar : this.f67902q) {
            if (oylVar.mo48709f()) {
                bnl0.m105509E0(oylVar.getClickView(), new View.OnClickListener() { // from class: l.z0x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f202433a.m95574p(oylVar, view);
                    }
                });
            }
        }
        ltf0.m155773c(this.f67888c, new C15620a());
        this.f67898m.addTextChangedListener(new C15621b());
        m95582q(true, this.f67901p.f197059a);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m95579l(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public View m95579l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b1x.m101509b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(y0x y0xVar) {
        this.f67901p = y0xVar;
    }

    /* JADX INFO: renamed from: n */
    public String m95581n() {
        return this.f67898m.getText().toString();
    }

    /* JADX INFO: renamed from: q */
    public void m95582q(boolean z, User user) {
        Iterator<oyl> it = this.f67902q.iterator();
        while (it.hasNext()) {
            it.next().mo48708d(user);
        }
        if (z) {
            this.f67898m.setText(user.profile.extensions.marriage.mateDescription.get(0));
            VEditText vEditText = this.f67898m;
            vEditText.setSelection(vEditText.getText().length());
            m95583s(user.profile.extensions.marriage.mateDescription.get(0));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m95583s(String str) {
        if (str == null) {
            str = "";
        }
        this.f67899n.setText(String.valueOf(300 - str.length()));
    }

    /* JADX INFO: renamed from: l.a1x$b */
    public class C15621b implements TextWatcher {
        public C15621b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a1x.this.m95583s(editable == null ? null : String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
