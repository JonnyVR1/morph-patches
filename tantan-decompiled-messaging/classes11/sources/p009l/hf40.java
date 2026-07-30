package p009l;

import android.animation.Animator;
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
import com.p000p1.mobile.putong.core.newui.newuserbatchgreet.NewUserBatchGreetAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GreetingBatchPostBody;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.bt0;
import l.h30;
import l.if40;
import l.j760;
import l.jig;
import l.osi0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VEditText;
import v.VFrame;
import v.VIcon;
import v.VLinear;
import v.VRecyclerView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hf40 implements s7m<cf40> {

    /* JADX INFO: renamed from: a */
    public VRelative f14034a;

    /* JADX INFO: renamed from: b */
    public View f14035b;

    /* JADX INFO: renamed from: c */
    public VLinear f14036c;

    /* JADX INFO: renamed from: d */
    public VFrame f14037d;

    /* JADX INFO: renamed from: e */
    public VIcon f14038e;

    /* JADX INFO: renamed from: f */
    public TextView f14039f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f14040g;

    /* JADX INFO: renamed from: h */
    public VLinear f14041h;

    /* JADX INFO: renamed from: i */
    public VLinear f14042i;

    /* JADX INFO: renamed from: j */
    public VEditText f14043j;

    /* JADX INFO: renamed from: k */
    public VText f14044k;

    /* JADX INFO: renamed from: l */
    public View f14045l;

    /* JADX INFO: renamed from: m */
    public NewUserBatchGreetAct f14046m;

    /* JADX INFO: renamed from: n */
    public lf40 f14047n;

    /* JADX INFO: renamed from: o */
    public boolean f14048o;

    /* JADX INFO: renamed from: p */
    public int f14049p;

    /* JADX INFO: renamed from: q */
    public int f14050q;

    /* JADX INFO: renamed from: r */
    public cf40 f14051r;

    /* JADX INFO: renamed from: s */
    public Interpolator f14052s = new jig();

    public hf40(NewUserBatchGreetAct newUserBatchGreetAct) {
        this.f14046m = newUserBatchGreetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m15617k(View view) {
        this.f14046m.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m15618l(View view) {
        this.f14046m.finish();
    }

    /* JADX INFO: renamed from: s */
    private void m15619s(List<User> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DbObject) it.next()).id);
        }
        zvf0.A("e_greeting_new", "p_kankan_stranger_message", new j760[]{vwb.Y("to_uid", arrayList.toString())});
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15620C0() {
        return this.f14046m;
    }

    @Nullable
    public Act act() {
        return this.f14046m;
    }

    /* JADX INFO: renamed from: e */
    public View m15621e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return if40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m15624i1(cf40 cf40Var) {
        this.f14051r = cf40Var;
    }

    /* JADX INFO: renamed from: i */
    public void m15623i() {
        this.f14048o = false;
        Interpolator interpolator = this.f14052s;
        VLinear vLinear = this.f14041h;
        Property property = View.TRANSLATION_Y;
        bt0.u(true, interpolator, 390L, new Animator[]{bt0.n(vLinear, property, new float[]{0.0f}), bt0.n(this.f14036c, property, new float[]{0.0f})}).start();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View upKeyboardDetectorLayout = act().setUpKeyboardDetectorLayout(m15621e(layoutInflater, viewGroup), new View(act()), new h30() { // from class: l.df40
            /* JADX INFO: renamed from: b */
            public final void m13301b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f11814a.m15625j((Boolean) obj, (Integer) obj2, (Boolean) obj3, (Integer) obj4);
            }
        });
        lf40 lf40Var = new lf40();
        this.f14047n = lf40Var;
        this.f14040g.setAdapter(lf40Var);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f14046m, 3);
        mf40 mf40Var = new mf40(3, t100.d(29.0f), t100.d(70.0f));
        this.f14040g.setLayoutManager(gridLayoutManager);
        this.f14040g.addItemDecoration(mf40Var);
        if (!TextUtils.isEmpty(CoreModule.c.V1.T)) {
            this.f14043j.setText(CoreModule.c.V1.T);
        }
        this.f14044k.setEnabled(!TextUtils.isEmpty(this.f14043j.getText()));
        xdl0.E0(this.f14035b, new View.OnClickListener() { // from class: l.ef40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12542a.m15617k(view);
            }
        });
        xdl0.E0(this.f14038e, new View.OnClickListener() { // from class: l.ff40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12985a.m15618l(view);
            }
        });
        xdl0.E0(this.f14044k, new View.OnClickListener() { // from class: l.gf40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13503a.m15626m(view);
            }
        });
        this.f14043j.addTextChangedListener(new C0935a());
        return upKeyboardDetectorLayout;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m15625j(Boolean bool, Integer num, Boolean bool2, Integer num2) {
        m15627n(bool.booleanValue() ? num.intValue() : 0);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m15626m(View view) {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9.isJailed() || userP9.isBannedNew() || userP9.isNameFake() || CoreModule.c.e0.c8()) {
            osi0.g("检测到您的账号异常，请稍后再试");
            return;
        }
        List<String> listM17860C = this.f14047n.m17860C();
        m15629q(listM17860C);
        if (vwb.J(listM17860C)) {
            osi0.g("需要勾选至少1个用户才能发送");
            return;
        }
        GreetingBatchPostBody greetingBatchPostBodyNew_ = GreetingBatchPostBody.new_();
        greetingBatchPostBodyNew_.action = "greeting";
        greetingBatchPostBodyNew_.value = this.f14043j.getText().toString();
        greetingBatchPostBodyNew_.userIds = listM17860C;
        this.f14051r.m12547j0(greetingBatchPostBodyNew_);
    }

    /* JADX INFO: renamed from: n */
    public void m15627n(int i) {
        if (i == 0 && this.f14048o) {
            m15623i();
        } else if (i > 0) {
            m15630u(i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m15628p(List list) {
        m15619s(list);
        this.f14047n.m17865I(list);
    }

    /* JADX INFO: renamed from: q */
    public final void m15629q(List<String> list) {
        zvf0.u("e_greeting_new", "p_kankan_stranger_message", new j760[]{vwb.Y("to_uid", list.toString()), vwb.Y("pick_num", Integer.valueOf(list.size()))});
    }

    /* JADX INFO: renamed from: u */
    public void m15630u(int i) {
        this.f14049p = i;
        this.f14048o = true;
        int iMin = Math.min(this.f14036c.getTop() - xdl0.F0(), i - this.f14045l.getHeight());
        this.f14050q = iMin;
        if (iMin < 0) {
            this.f14050q = 0;
        }
        Interpolator interpolator = this.f14052s;
        VLinear vLinear = this.f14041h;
        Property property = View.TRANSLATION_Y;
        bt0.u(true, interpolator, 390L, new Animator[]{bt0.n(vLinear, property, new float[]{Math.min((this.f14050q - i) + this.f14045l.getHeight(), 0)}), bt0.n(this.f14036c, property, new float[]{-this.f14050q})}).start();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.hf40$a */
    public class C0935a implements TextWatcher {
        public C0935a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            hf40.this.f14044k.setEnabled(!TextUtils.isEmpty(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
