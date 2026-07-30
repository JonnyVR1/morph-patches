package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p051p1.mobile.putong.core.newui.newuserbatchgreet.NewUserBatchGreetAct;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class vn40 implements iam<qn40> {

    /* JADX INFO: renamed from: a */
    public VRelative f184805a;

    /* JADX INFO: renamed from: b */
    public View f184806b;

    /* JADX INFO: renamed from: c */
    public VLinear f184807c;

    /* JADX INFO: renamed from: d */
    public VFrame f184808d;

    /* JADX INFO: renamed from: e */
    public VIcon f184809e;

    /* JADX INFO: renamed from: f */
    public TextView f184810f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f184811g;

    /* JADX INFO: renamed from: h */
    public VLinear f184812h;

    /* JADX INFO: renamed from: i */
    public VLinear f184813i;

    /* JADX INFO: renamed from: j */
    public VEditText f184814j;

    /* JADX INFO: renamed from: k */
    public VText f184815k;

    /* JADX INFO: renamed from: l */
    public View f184816l;

    /* JADX INFO: renamed from: m */
    public NewUserBatchGreetAct f184817m;

    /* JADX INFO: renamed from: n */
    public zn40 f184818n;

    /* JADX INFO: renamed from: o */
    public boolean f184819o;

    /* JADX INFO: renamed from: p */
    public int f184820p;

    /* JADX INFO: renamed from: q */
    public int f184821q;

    /* JADX INFO: renamed from: r */
    public qn40 f184822r;

    /* JADX INFO: renamed from: s */
    public Interpolator f184823s = new xjg();

    public vn40(NewUserBatchGreetAct newUserBatchGreetAct) {
        this.f184817m = newUserBatchGreetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m201903k(View view) {
        this.f184817m.m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m201904l(View view) {
        this.f184817m.m45660g2();
    }

    /* JADX INFO: renamed from: s */
    private void m201905s(List<User> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f56859id);
        }
        i4g0.m138492A("e_greeting_new", "p_kankan_stranger_message", jyb.m147494Y("to_uid", arrayList.toString()));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f184817m;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f184817m;
    }

    /* JADX INFO: renamed from: e */
    public View m201906e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wn40.m207138b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qn40 qn40Var) {
        this.f184822r = qn40Var;
    }

    /* JADX INFO: renamed from: i */
    public void m201908i() {
        this.f184819o = false;
        Interpolator interpolator = this.f184823s;
        VLinear vLinear = this.f184812h;
        Property property = View.TRANSLATION_Y;
        gt0.m132175u(true, interpolator, 390L, gt0.m132168n(vLinear, property, 0.0f), gt0.m132168n(this.f184807c, property, 0.0f)).start();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = act().setUpKeyboardDetectorLayout(m201906e(layoutInflater, viewGroup), new View(act()), new b30() { // from class: l.rn40
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f163949a.m201909j((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        zn40 zn40Var = new zn40();
        this.f184818n = zn40Var;
        this.f184811g.setAdapter(zn40Var);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f184817m, 3);
        ao40 ao40Var = new ao40(3, qa00.m175859d(29.0f), qa00.m175859d(70.0f));
        this.f184811g.setLayoutManager(gridLayoutManager);
        this.f184811g.addItemDecoration(ao40Var);
        if (!TextUtils.isEmpty(CoreModule.f18264c.f20356V1.f150517T)) {
            this.f184814j.setText(CoreModule.f18264c.f20356V1.f150517T);
        }
        this.f184815k.setEnabled(!TextUtils.isEmpty(this.f184814j.getText()));
        bnl0.m105509E0(this.f184806b, new View.OnClickListener() { // from class: l.sn40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169643a.m201903k(view);
            }
        });
        bnl0.m105509E0(this.f184809e, new View.OnClickListener() { // from class: l.tn40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175225a.m201904l(view);
            }
        });
        bnl0.m105509E0(this.f184815k, new View.OnClickListener() { // from class: l.un40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179698a.m201910m(view);
            }
        });
        this.f184814j.addTextChangedListener(new C20860a());
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m201909j(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m201911n(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m201910m(View view) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9.isJailed() || userM116600p9.isBannedNew() || userM116600p9.isNameFake() || CoreModule.f18264c.f20381e0.m116549c8()) {
            r1j0.m179420g("检测到您的账号异常，请稍后再试");
            return;
        }
        List<String> listM220579C = this.f184818n.m220579C();
        m201913q(listM220579C);
        if (jyb.m147479J(listM220579C)) {
            r1j0.m179420g("需要勾选至少1个用户才能发送");
            return;
        }
        GreetingBatchPostBody greetingBatchPostBodyNew_ = GreetingBatchPostBody.new_();
        greetingBatchPostBodyNew_.action = "greeting";
        greetingBatchPostBodyNew_.value = this.f184814j.getText().toString();
        greetingBatchPostBodyNew_.userIds = listM220579C;
        this.f184822r.m177209j0(greetingBatchPostBodyNew_);
    }

    /* JADX INFO: renamed from: n */
    public void m201911n(int i) {
        if (i == 0 && this.f184819o) {
            m201908i();
        } else if (i > 0) {
            m201914u(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m201912p(List list) {
        m201905s(list);
        this.f184818n.m220584I(list);
    }

    /* JADX INFO: renamed from: q */
    public final void m201913q(List<String> list) {
        i4g0.m138523u("e_greeting_new", "p_kankan_stranger_message", jyb.m147494Y("to_uid", list.toString()), jyb.m147494Y("pick_num", Integer.valueOf(list.size())));
    }

    /* JADX INFO: renamed from: u */
    public void m201914u(int i) {
        this.f184820p = i;
        this.f184819o = true;
        int iMin = Math.min(this.f184807c.getTop() - bnl0.m105511F0(), i - this.f184816l.getHeight());
        this.f184821q = iMin;
        if (iMin < 0) {
            this.f184821q = 0;
        }
        Interpolator interpolator = this.f184823s;
        VLinear vLinear = this.f184812h;
        Property property = View.TRANSLATION_Y;
        gt0.m132175u(true, interpolator, 390L, gt0.m132168n(vLinear, property, Math.min((this.f184821q - i) + this.f184816l.getHeight(), 0)), gt0.m132168n(this.f184807c, property, -this.f184821q)).start();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.vn40$a */
    public class C20860a implements TextWatcher {
        public C20860a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            vn40.this.f184815k.setEnabled(!TextUtils.isEmpty(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
