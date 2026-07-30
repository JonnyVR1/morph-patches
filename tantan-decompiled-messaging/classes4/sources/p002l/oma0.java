package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopSingleLineTextFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.User;
import l.e51;
import l.pc8;
import l.pma0;
import l.s7m;
import l.vwb;
import l.xdl0;
import v.VEditText;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oma0 implements s7m<kma0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f16705a;

    /* JADX INFO: renamed from: b */
    public VText_Default_Bold f16706b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f16707c;

    /* JADX INFO: renamed from: d */
    public VEditText f16708d;

    /* JADX INFO: renamed from: e */
    public VImage f16709e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f16710f;

    /* JADX INFO: renamed from: g */
    public Context f16711g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopSingleLineTextFrag f16712h;

    /* JADX INFO: renamed from: i */
    public kma0 f16713i;

    /* JADX INFO: renamed from: j */
    public LoopInputType f16714j;

    /* JADX INFO: renamed from: k */
    public int f16715k = 15;

    /* JADX INFO: renamed from: l.oma0$b */
    public static /* synthetic */ class C0729b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16717a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f16717a = iArr;
            try {
                iArr[LoopInputType.GAME_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public oma0(Context context, ProfileLoopSingleLineTextFrag profileLoopSingleLineTextFrag) {
        this.f16711g = context;
        this.f16712h = profileLoopSingleLineTextFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19628C0() {
        return this.f16711g;
    }

    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: e */
    public View m19629e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pma0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m19632i1(kma0 kma0Var) {
        this.f16713i = kma0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m19631i(User user) {
        if (C0729b.f16717a[this.f16714j.ordinal()] != 1) {
            return;
        }
        user.profile.extensions.game.level = vwb.f0(new String[]{this.f16708d.getText().toString().trim()});
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m19629e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public Bundle m19633j() {
        return this.f16712h.getArguments();
    }

    /* JADX INFO: renamed from: k */
    public ProfileInfoLoopEditAct m19634k() {
        return (ProfileInfoLoopEditAct) this.f16711g;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m19635l(View view, boolean z) {
        this.f16708d.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m19636m(View view) {
        this.f16708d.setText("");
        this.f16709e.setVisibility(8);
        this.f16708d.requestFocus();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m19637n() {
        this.f16708d.requestFocus();
        m19634k().showInput(this.f16708d, 0);
    }

    /* JADX INFO: renamed from: p */
    public void m19638p(LoopInputType loopInputType) {
        String str;
        this.f16714j = loopInputType;
        this.f16706b.setText(loopInputType.title);
        if (C0729b.f16717a[loopInputType.ordinal()] != 1) {
            str = null;
        } else {
            if (m19634k().m1991a2().m2043u0().profile.extensions.game == null) {
                m19634k().m1991a2().m2043u0().profile.extensions.game = ExtensionGame.new_();
            }
            m19634k().m1991a2().m2043u0().profile.extensions.game.nullCheck();
            str = (String) pc8.t0(m19634k().m1991a2().m2043u0().profile.extensions.game.level);
            this.f16715k = 15;
        }
        this.f16708d.setText(str);
        this.f16708d.setSelection(TextUtils.isEmpty(str) ? 0 : str.length());
        this.f16708d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.lma0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f14953a.m19635l(view, z);
            }
        });
        this.f16708d.addTextChangedListener(new C0728a());
        xdl0.M(this.f16709e, true ^ TextUtils.isEmpty(this.f16708d.getText().toString()));
        xdl0.E0(this.f16709e, new View.OnClickListener() { // from class: l.mma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15475a.m19636m(view);
            }
        });
        e51.I(this.f16712h, new Runnable() { // from class: l.nma0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16105a.m19637n();
            }
        }, 300L);
        this.f16710f.m3527l(this.f16712h);
        m19634k().m1991a2().m2030W0(this.f16712h);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.oma0$a */
    public class C0728a implements TextWatcher {
        public C0728a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > oma0.this.f16715k) {
                oma0 oma0Var = oma0.this;
                oma0Var.f16708d.setText(editable.subSequence(0, oma0Var.f16715k));
                oma0 oma0Var2 = oma0.this;
                oma0Var2.f16708d.setSelection(oma0Var2.f16715k);
            }
            xdl0.M(oma0.this.f16709e, !TextUtils.isEmpty(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
