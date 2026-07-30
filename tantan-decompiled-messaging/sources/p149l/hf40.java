package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p046p1.mobile.putong.core.newui.newuserbatchgreet.NewUserBatchGreetAct;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class hf40 implements s7m<cf40> {

    /* JADX INFO: renamed from: a */
    public VRelative f107431a;

    /* JADX INFO: renamed from: b */
    public View f107432b;

    /* JADX INFO: renamed from: c */
    public VLinear f107433c;

    /* JADX INFO: renamed from: d */
    public VFrame f107434d;

    /* JADX INFO: renamed from: e */
    public VIcon f107435e;

    /* JADX INFO: renamed from: f */
    public TextView f107436f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f107437g;

    /* JADX INFO: renamed from: h */
    public VLinear f107438h;

    /* JADX INFO: renamed from: i */
    public VLinear f107439i;

    /* JADX INFO: renamed from: j */
    public VEditText f107440j;

    /* JADX INFO: renamed from: k */
    public VText f107441k;

    /* JADX INFO: renamed from: l */
    public View f107442l;

    /* JADX INFO: renamed from: m */
    public NewUserBatchGreetAct f107443m;

    /* JADX INFO: renamed from: n */
    public lf40 f107444n;

    /* JADX INFO: renamed from: o */
    public boolean f107445o;

    /* JADX INFO: renamed from: p */
    public int f107446p;

    /* JADX INFO: renamed from: q */
    public int f107447q;

    /* JADX INFO: renamed from: r */
    public cf40 f107448r;

    /* JADX INFO: renamed from: s */
    public Interpolator f107449s = new jig();

    public hf40(NewUserBatchGreetAct newUserBatchGreetAct) {
        this.f107443m = newUserBatchGreetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m130737k(View view) {
        this.f107443m.m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m130738l(View view) {
        this.f107443m.m44477e2();
    }

    /* JADX INFO: renamed from: s */
    private void m130739s(List<User> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f56011id);
        }
        zvf0.m220368A("e_greeting_new", "p_kankan_stranger_message", vwb.m200311Y("to_uid", arrayList.toString()));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107443m;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f107443m;
    }

    /* JADX INFO: renamed from: e */
    public View m130740e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return if40.m135882b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cf40 cf40Var) {
        this.f107448r = cf40Var;
    }

    /* JADX INFO: renamed from: i */
    public void m130742i() {
        this.f107445o = false;
        Interpolator interpolator = this.f107449s;
        VLinear vLinear = this.f107438h;
        Property property = View.TRANSLATION_Y;
        bt0.m103748u(true, interpolator, 390L, bt0.m103741n(vLinear, property, 0.0f), bt0.m103741n(this.f107433c, property, 0.0f)).start();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = act().setUpKeyboardDetectorLayout(m130740e(layoutInflater, viewGroup), new View(act()), new h30() { // from class: l.df40
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f85892a.m130743j((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        lf40 lf40Var = new lf40();
        this.f107444n = lf40Var;
        this.f107437g.setAdapter(lf40Var);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f107443m, 3);
        mf40 mf40Var = new mf40(3, t100.m186890d(29.0f), t100.m186890d(70.0f));
        this.f107437g.setLayoutManager(gridLayoutManager);
        this.f107437g.addItemDecoration(mf40Var);
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19614V1.f83481T)) {
            this.f107440j.setText(CoreModule.f17545c.f19614V1.f83481T);
        }
        this.f107441k.setEnabled(!TextUtils.isEmpty(this.f107440j.getText()));
        xdl0.m208329E0(this.f107432b, new View.OnClickListener() { // from class: l.ef40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90800a.m130737k(view);
            }
        });
        xdl0.m208329E0(this.f107435e, new View.OnClickListener() { // from class: l.ff40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97183a.m130738l(view);
            }
        });
        xdl0.m208329E0(this.f107441k, new View.OnClickListener() { // from class: l.gf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102331a.m130744m(view);
            }
        });
        this.f107440j.addTextChangedListener(new C17298a());
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m130743j(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m130745n(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m130744m(View view) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9.isJailed() || userM169527p9.isBannedNew() || userM169527p9.isNameFake() || CoreModule.f17545c.f19639e0.m169476c8()) {
            osi0.m165783g("检测到您的账号异常，请稍后再试");
            return;
        }
        List<String> listM149634C = this.f107444n.m149634C();
        m130747q(listM149634C);
        if (vwb.m200296J(listM149634C)) {
            osi0.m165783g("需要勾选至少1个用户才能发送");
            return;
        }
        GreetingBatchPostBody greetingBatchPostBodyNew_ = GreetingBatchPostBody.new_();
        greetingBatchPostBodyNew_.action = "greeting";
        greetingBatchPostBodyNew_.value = this.f107440j.getText().toString();
        greetingBatchPostBodyNew_.userIds = listM149634C;
        this.f107448r.m106484j0(greetingBatchPostBodyNew_);
    }

    /* JADX INFO: renamed from: n */
    public void m130745n(int i) {
        if (i == 0 && this.f107445o) {
            m130742i();
        } else if (i > 0) {
            m130748u(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m130746p(List list) {
        m130739s(list);
        this.f107444n.m149639I(list);
    }

    /* JADX INFO: renamed from: q */
    public final void m130747q(List<String> list) {
        zvf0.m220399u("e_greeting_new", "p_kankan_stranger_message", vwb.m200311Y("to_uid", list.toString()), vwb.m200311Y("pick_num", Integer.valueOf(list.size())));
    }

    /* JADX INFO: renamed from: u */
    public void m130748u(int i) {
        this.f107446p = i;
        this.f107445o = true;
        int iMin = Math.min(this.f107433c.getTop() - xdl0.m208331F0(), i - this.f107442l.getHeight());
        this.f107447q = iMin;
        if (iMin < 0) {
            this.f107447q = 0;
        }
        Interpolator interpolator = this.f107449s;
        VLinear vLinear = this.f107438h;
        Property property = View.TRANSLATION_Y;
        bt0.m103748u(true, interpolator, 390L, bt0.m103741n(vLinear, property, Math.min((this.f107447q - i) + this.f107442l.getHeight(), 0)), bt0.m103741n(this.f107433c, property, -this.f107447q)).start();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.hf40$a */
    public class C17298a implements TextWatcher {
        public C17298a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            hf40.this.f107441k.setEnabled(!TextUtils.isEmpty(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
