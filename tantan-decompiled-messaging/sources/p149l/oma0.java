package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopSingleLineTextFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.User;
import p147v.VEditText;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class oma0 implements s7m<kma0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f144593a;

    /* JADX INFO: renamed from: b */
    public VText_Default_Bold f144594b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f144595c;

    /* JADX INFO: renamed from: d */
    public VEditText f144596d;

    /* JADX INFO: renamed from: e */
    public VImage f144597e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f144598f;

    /* JADX INFO: renamed from: g */
    public Context f144599g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopSingleLineTextFrag f144600h;

    /* JADX INFO: renamed from: i */
    public kma0 f144601i;

    /* JADX INFO: renamed from: j */
    public LoopInputType f144602j;

    /* JADX INFO: renamed from: k */
    public int f144603k = 15;

    /* JADX INFO: renamed from: l.oma0$b */
    public static /* synthetic */ class C18974b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f144605a;

        static {
            int[] iArr = new int[LoopInputType.values().length];
            f144605a = iArr;
            try {
                iArr[LoopInputType.GAME_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public oma0(Context context, ProfileLoopSingleLineTextFrag profileLoopSingleLineTextFrag) {
        this.f144599g = context;
        this.f144600h = profileLoopSingleLineTextFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f144599g;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return super.act();
    }

    /* JADX INFO: renamed from: e */
    public View m165017e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pma0.m170301b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kma0 kma0Var) {
        this.f144601i = kma0Var;
    }

    /* JADX INFO: renamed from: i */
    public void m165019i(User user) {
        if (C18974b.f144605a[this.f144602j.ordinal()] != 1) {
            return;
        }
        user.profile.extensions.game.level = vwb.m200324f0(this.f144596d.getText().toString().trim());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m165017e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public Bundle m165020j() {
        return this.f144600h.getArguments();
    }

    /* JADX INFO: renamed from: k */
    public ProfileInfoLoopEditAct m165021k() {
        return (ProfileInfoLoopEditAct) this.f144599g;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m165022l(View view, boolean z) {
        this.f144596d.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m165023m(View view) {
        this.f144596d.setText("");
        this.f144597e.setVisibility(8);
        this.f144596d.requestFocus();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m165024n() {
        this.f144596d.requestFocus();
        m165021k().showInput(this.f144596d, 0);
    }

    /* JADX INFO: renamed from: p */
    public void m165025p(LoopInputType loopInputType) {
        String str;
        this.f144602j = loopInputType;
        this.f144594b.setText(loopInputType.title);
        if (C18974b.f144605a[loopInputType.ordinal()] != 1) {
            str = null;
        } else {
            if (m165021k().m51509a2().m51559u0().profile.extensions.game == null) {
                m165021k().m51509a2().m51559u0().profile.extensions.game = ExtensionGame.new_();
            }
            m165021k().m51509a2().m51559u0().profile.extensions.game.nullCheck();
            str = (String) pc8.m168316t0(m165021k().m51509a2().m51559u0().profile.extensions.game.level);
            this.f144603k = 15;
        }
        this.f144596d.setText(str);
        this.f144596d.setSelection(TextUtils.isEmpty(str) ? 0 : str.length());
        this.f144596d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.lma0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f128778a.m165022l(view, z);
            }
        });
        this.f144596d.addTextChangedListener(new C18973a());
        xdl0.m208344M(this.f144597e, true ^ TextUtils.isEmpty(this.f144596d.getText().toString()));
        xdl0.m208329E0(this.f144597e, new View.OnClickListener() { // from class: l.mma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134596a.m165023m(view);
            }
        });
        e51.m114744I(this.f144600h, new Runnable() { // from class: l.nma0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139619a.m165024n();
            }
        }, 300L);
        this.f144598f.m52969l(this.f144600h);
        m165021k().m51509a2().m51548W0(this.f144600h);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.oma0$a */
    public class C18973a implements TextWatcher {
        public C18973a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() > oma0.this.f144603k) {
                oma0 oma0Var = oma0.this;
                oma0Var.f144596d.setText(editable.subSequence(0, oma0Var.f144603k));
                oma0 oma0Var2 = oma0.this;
                oma0Var2.f144596d.setSelection(oma0Var2.f144603k);
            }
            xdl0.m208344M(oma0.this.f144597e, !TextUtils.isEmpty(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
