package p153l;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.school.ProfileLoopSelectSchoolFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class kua0 implements iam<fua0> {

    /* JADX INFO: renamed from: a */
    public VRelative f128829a;

    /* JADX INFO: renamed from: b */
    public TextView f128830b;

    /* JADX INFO: renamed from: c */
    public TextView f128831c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f128832d;

    /* JADX INFO: renamed from: e */
    public VEditText f128833e;

    /* JADX INFO: renamed from: f */
    public VImage f128834f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f128835g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopActionLayout f128836h;

    /* JADX INFO: renamed from: i */
    public final Context f128837i;

    /* JADX INFO: renamed from: j */
    public final ProfileLoopSelectSchoolFrag f128838j;

    /* JADX INFO: renamed from: k */
    public fua0 f128839k;

    /* JADX INFO: renamed from: l */
    public C18266d f128840l;

    /* JADX INFO: renamed from: m */
    public List<String> f128841m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f128842n = true;

    /* JADX INFO: renamed from: l.kua0$a */
    public class C18263a extends RecyclerView.AbstractC0584t {
        public C18263a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (kua0.this.f128840l.getItemCount() <= 0 || i != 1) {
                return;
            }
            kua0.this.m151487C().hideInput();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.kua0$c */
    public static class C18265c {
        /* JADX INFO: renamed from: b */
        public static void m151499b(kua0 kua0Var, View view) {
            kua0Var.f128829a = (VRelative) view;
            ViewGroup viewGroup = (ViewGroup) view;
            kua0Var.f128830b = (TextView) viewGroup.getChildAt(0);
            kua0Var.f128831c = (TextView) viewGroup.getChildAt(1);
            kua0Var.f128832d = (RelativeLayout) viewGroup.getChildAt(2);
            kua0Var.f128833e = (VEditText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
            kua0Var.f128834f = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
            kua0Var.f128835g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            kua0Var.f128836h = (ProfileLoopActionLayout) viewGroup.getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m151500c(kua0 kua0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167524M0, viewGroup, false);
            m151499b(kua0Var, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.kua0$d */
    public class C18266d extends jic0<String> {
        public C18266d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m151502H(int i, View view) {
            kua0.this.m151488E(i);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return kua0.this.f128841m.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(kua0.this.getAct());
            textView.setTextColor(Color.parseColor("#212121"));
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            RecyclerView.C0580p c0580p = new RecyclerView.C0580p(-1, qa00.m175859d(56.0f));
            ((ViewGroup.MarginLayoutParams) c0580p).leftMargin = qa00.m175859d(16.0f);
            textView.setLayoutParams(c0580p);
            return textView;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, String str, int i, final int i2) {
            ((TextView) view).setText(getItem(i2));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.lua0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f133612a.m151502H(i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) kua0.this.f128841m.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public kua0(Context context, ProfileLoopSelectSchoolFrag profileLoopSelectSchoolFrag) {
        this.f128837i = context;
        this.f128838j = profileLoopSelectSchoolFrag;
    }

    /* JADX INFO: renamed from: A */
    public void m151485A(User user) {
        LoopFragmentFactory.m52674l(user, LoopInputType.SCHOOL_NEW, "", this.f128833e.getText().toString(), 0);
    }

    /* JADX INFO: renamed from: B */
    public Bundle m151486B() {
        return this.f128838j.getArguments();
    }

    /* JADX INFO: renamed from: C */
    public ProfileInfoLoopEditAct m151487C() {
        return (ProfileInfoLoopEditAct) this.f128837i;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128837i;
    }

    /* JADX INFO: renamed from: E */
    public final void m151488E(int i) {
        this.f128830b.setFocusableInTouchMode(true);
        this.f128833e.clearFocus();
        String item = this.f128840l.getItem(i);
        this.f128833e.setText(item);
        this.f128833e.setSelection(item.length());
        m151494K(null);
        m151493J(true);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m151489F(View view, boolean z) {
        this.f128833e.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m151490G(View view) {
        this.f128842n = true;
        this.f128833e.setText("");
        this.f128834f.setVisibility(8);
        m151494K(null);
        this.f128833e.requestFocus();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m151491H() {
        this.f128833e.requestFocus();
        m151487C().showInput(this.f128833e, 0);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m151492I(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        this.f128842n = zBooleanValue;
        if (Build.VERSION.SDK_INT > 34) {
            bnl0.m105537U(this.f128836h, zBooleanValue ? num.intValue() : 0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m151493J(boolean z) {
        this.f128836h.f35011b.setEnabled(z);
        this.f128836h.f35011b.setClickable(z);
        ProfileLoopActionLayout profileLoopActionLayout = this.f128836h;
        if (z) {
            profileLoopActionLayout.f35011b.setBackgroundResource(kbc0.f124866f);
        } else {
            profileLoopActionLayout.f35011b.setBackgroundResource(kbc0.f124906r1);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m151494K(List<String> list) {
        this.f128841m.clear();
        if (NullChecker.m82486a(list)) {
            this.f128841m = list;
        }
        if (jyb.m147479J(list)) {
            m151493J(true);
            this.f128836h.setVisibility(0);
        } else {
            this.f128836h.setVisibility(8);
        }
        this.f128840l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m151495L(String str) {
        if (NullChecker.m82486a(str)) {
            this.f128830b.setText(str);
        }
        String string = getAct().getResources().getString(R$string.f28743n1);
        this.f128833e.setHint(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string);
        this.f128835g.setLayoutManager(new LinearLayoutManager(getAct(), 1, false));
        this.f128835g.setOverScrollMode(0);
        C18266d c18266d = new C18266d();
        this.f128840l = c18266d;
        this.f128835g.setAdapter(c18266d);
        this.f128835g.addOnScrollListener(new C18263a());
        String str2 = m151487C().m52692b2().m52742u0().profile.studies.school;
        if (TextUtils.isEmpty(str2)) {
            m151493J(false);
        } else {
            this.f128833e.setText(str2);
            this.f128833e.setSelection(str2.length());
            m151493J(true);
        }
        this.f128833e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.gua0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f106477a.m151489F(view, z);
            }
        });
        this.f128833e.addTextChangedListener(new C18264b());
        bnl0.m105509E0(this.f128834f, new View.OnClickListener() { // from class: l.hua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111628a.m151490G(view);
            }
        });
        l51.m152889I(this.f128838j, new Runnable() { // from class: l.iua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116911a.m151491H();
            }
        }, 300L);
        m151487C().setUpKeyboardDetectorLayout(new View(m151487C()), this.f128829a, new z20() { // from class: l.jua0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f122694a.m151492I((Boolean) obj, (Integer) obj2);
            }
        });
        this.f128836h.m54152l(this.f128838j);
        m151487C().m52692b2().m52731W0(this.f128838j);
        if (xra.m212787f() && this.f128838j.m52778U4()) {
            String strM192426m = tr90.m192426m(this.f128838j.f34303z);
            bnl0.m105540X(this.f128830b, 0);
            if (TextUtils.isEmpty(strM192426m)) {
                return;
            }
            bnl0.m105524M(this.f128831c, true);
            bnl0.m105540X(this.f128831c, qa00.m175859d(12.0f));
            bnl0.m105540X(this.f128832d, qa00.m175859d(20.0f));
            this.f128831c.setTextSize(15.0f);
            this.f128831c.setTextColor(Color.parseColor("#a9a9a9"));
            this.f128831c.setText(String.format("预计符合%s人的理想型", strM192426m));
        }
    }

    @Override // p153l.iam
    public void destroy() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        m151487C().clearUpKeyboardListenerAndResizeChildOfContent();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m151496y(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public View m151496y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18265c.m151500c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fua0 fua0Var) {
        this.f128839k = fua0Var;
    }

    /* JADX INFO: renamed from: l.kua0$b */
    public class C18264b implements TextWatcher {
        public C18264b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (kua0.this.f128842n && kua0.this.f128833e.isFocused()) {
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
                kua0 kua0Var = kua0.this;
                if (zIsEmpty) {
                    kua0Var.f128834f.setVisibility(8);
                    kua0.this.m151494K(null);
                } else {
                    kua0Var.f128834f.setVisibility(0);
                    kua0.this.f128839k.m127446j0(editable.toString().trim());
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
