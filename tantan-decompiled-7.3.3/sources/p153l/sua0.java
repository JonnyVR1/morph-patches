package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSingleLineTextFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.User;
import p151v.VEditText;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class sua0 implements iam<oua0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f170661a;

    /* JADX INFO: renamed from: b */
    public VText_Default_Bold f170662b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f170663c;

    /* JADX INFO: renamed from: d */
    public VEditText f170664d;

    /* JADX INFO: renamed from: e */
    public VImage f170665e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f170666f;

    /* JADX INFO: renamed from: g */
    public Context f170667g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopSingleLineTextFrag f170668h;

    /* JADX INFO: renamed from: i */
    public oua0 f170669i;

    /* JADX INFO: renamed from: j */
    public LoopInputType f170670j;

    /* JADX INFO: renamed from: k */
    public int f170671k = 15;

    /* JADX INFO: renamed from: l.sua0$b */
    public static /* synthetic */ class C20156b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170673a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f170673a = iArr;
            try {
                iArr[LoopInputType.GAME_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public sua0(Context context, ProfileLoopSingleLineTextFrag profileLoopSingleLineTextFrag) {
        this.f170667g = context;
        this.f170668h = profileLoopSingleLineTextFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f170667g;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: e */
    public View m188014e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tua0.m192742b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(oua0 oua0Var) {
        this.f170669i = oua0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m188016i(User user) {
        if (C20156b.f170673a[this.f170670j.ordinal()] != 1) {
            return;
        }
        user.profile.extensions.game.level = jyb.m147507f0(this.f170664d.getText().toString().trim());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m188014e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public Bundle m188017j() {
        return this.f170668h.getArguments();
    }

    /* JADX INFO: renamed from: k */
    public ProfileInfoLoopEditAct m188018k() {
        return (ProfileInfoLoopEditAct) this.f170667g;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m188019l(View view, boolean z) {
        this.f170664d.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m188020m(View view) {
        this.f170664d.setText("");
        this.f170665e.setVisibility(8);
        this.f170664d.requestFocus();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m188021n() {
        this.f170664d.requestFocus();
        m188018k().showInput(this.f170664d, 0);
    }

    /* JADX INFO: renamed from: p */
    public void m188022p(LoopInputType loopInputType) {
        String str;
        this.f170670j = loopInputType;
        this.f170662b.setText(loopInputType.title);
        if (C20156b.f170673a[loopInputType.ordinal()] != 1) {
            str = null;
        } else {
            if (m188018k().m52692b2().m52742u0().profile.extensions.game == null) {
                m188018k().m52692b2().m52742u0().profile.extensions.game = ExtensionGame.new_();
            }
            m188018k().m52692b2().m52742u0().profile.extensions.game.nullCheck();
            str = (String) td8.m190610t0(m188018k().m52692b2().m52742u0().profile.extensions.game.level);
            this.f170671k = 15;
        }
        this.f170664d.setText(str);
        this.f170664d.setSelection(TextUtils.isEmpty(str) ? 0 : str.length());
        this.f170664d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.pua0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f154160a.m188019l(view, z);
            }
        });
        this.f170664d.addTextChangedListener(new C20155a());
        bnl0.m105524M(this.f170665e, true ^ TextUtils.isEmpty(this.f170664d.getText().toString()));
        bnl0.m105509E0(this.f170665e, new View.OnClickListener() { // from class: l.qua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159553a.m188020m(view);
            }
        });
        l51.m152889I(this.f170668h, new Runnable() { // from class: l.rua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f164910a.m188021n();
            }
        }, 300L);
        this.f170666f.m54152l(this.f170668h);
        m188018k().m52692b2().m52731W0(this.f170668h);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.sua0$a */
    public class C20155a implements TextWatcher {
        public C20155a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > sua0.this.f170671k) {
                sua0 sua0Var = sua0.this;
                sua0Var.f170664d.setText(editable.subSequence(0, sua0Var.f170671k));
                sua0 sua0Var2 = sua0.this;
                sua0Var2.f170664d.setSelection(sua0Var2.f170671k);
            }
            bnl0.m105524M(sua0.this.f170665e, !TextUtils.isEmpty(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
