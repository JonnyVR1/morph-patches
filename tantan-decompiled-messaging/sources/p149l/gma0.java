package p149l;

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
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.school.ProfileLoopSelectSchoolFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class gma0 implements s7m<bma0> {

    /* JADX INFO: renamed from: a */
    public VRelative f103434a;

    /* JADX INFO: renamed from: b */
    public TextView f103435b;

    /* JADX INFO: renamed from: c */
    public TextView f103436c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f103437d;

    /* JADX INFO: renamed from: e */
    public VEditText f103438e;

    /* JADX INFO: renamed from: f */
    public VImage f103439f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f103440g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopActionLayout f103441h;

    /* JADX INFO: renamed from: i */
    public final Context f103442i;

    /* JADX INFO: renamed from: j */
    public final ProfileLoopSelectSchoolFrag f103443j;

    /* JADX INFO: renamed from: k */
    public bma0 f103444k;

    /* JADX INFO: renamed from: l */
    public C17122d f103445l;

    /* JADX INFO: renamed from: m */
    public List<String> f103446m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f103447n = true;

    /* JADX INFO: renamed from: l.gma0$a */
    public class C17119a extends RecyclerView.AbstractC0582t {
        public C17119a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (gma0.this.f103445l.getItemCount() <= 0 || i != 1) {
                return;
            }
            gma0.this.m126955C().hideInput();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.gma0$c */
    public static class C17121c {
        /* JADX INFO: renamed from: b */
        public static void m126967b(gma0 gma0Var, View view) {
            gma0Var.f103434a = (VRelative) view;
            ViewGroup viewGroup = (ViewGroup) view;
            gma0Var.f103435b = (TextView) viewGroup.getChildAt(0);
            gma0Var.f103436c = (TextView) viewGroup.getChildAt(1);
            gma0Var.f103437d = (RelativeLayout) viewGroup.getChildAt(2);
            gma0Var.f103438e = (VEditText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
            gma0Var.f103439f = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
            gma0Var.f103440g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            gma0Var.f103441h = (ProfileLoopActionLayout) viewGroup.getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m126968c(gma0 gma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137310M0, viewGroup, false);
            m126967b(gma0Var, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.gma0$d */
    public class C17122d extends dac0<String> {
        public C17122d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m126970H(int i, View view) {
            gma0.this.m126956E(i);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return gma0.this.f103446m.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(gma0.this.getAct());
            textView.setTextColor(Color.parseColor("#212121"));
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            RecyclerView.C0578p c0578p = new RecyclerView.C0578p(-1, t100.m186890d(56.0f));
            ((ViewGroup.MarginLayoutParams) c0578p).leftMargin = t100.m186890d(16.0f);
            textView.setLayoutParams(c0578p);
            return textView;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, String str, int i, final int i2) {
            ((TextView) view).setText(getItem(i2));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.hma0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f108407a.m126970H(i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) gma0.this.f103446m.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public gma0(Context context, ProfileLoopSelectSchoolFrag profileLoopSelectSchoolFrag) {
        this.f103442i = context;
        this.f103443j = profileLoopSelectSchoolFrag;
    }

    /* JADX INFO: renamed from: A */
    public void m126953A(User user) {
        LoopFragmentFactory.m51491l(user, LoopInputType.SCHOOL_NEW, "", this.f103438e.getText().toString(), 0);
    }

    /* JADX INFO: renamed from: B */
    public Bundle m126954B() {
        return this.f103443j.getArguments();
    }

    /* JADX INFO: renamed from: C */
    public ProfileInfoLoopEditAct m126955C() {
        return (ProfileInfoLoopEditAct) this.f103442i;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f103442i;
    }

    /* JADX INFO: renamed from: E */
    public final void m126956E(int i) {
        this.f103435b.setFocusableInTouchMode(true);
        this.f103438e.clearFocus();
        String item = this.f103445l.getItem(i);
        this.f103438e.setText(item);
        this.f103438e.setSelection(item.length());
        m126962K(null);
        m126961J(true);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m126957F(View view, boolean z) {
        this.f103438e.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m126958G(View view) {
        this.f103447n = true;
        this.f103438e.setText("");
        this.f103439f.setVisibility(8);
        m126962K(null);
        this.f103438e.requestFocus();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m126959H() {
        this.f103438e.requestFocus();
        m126955C().showInput(this.f103438e, 0);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m126960I(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        this.f103447n = zBooleanValue;
        if (Build.VERSION.SDK_INT > 34) {
            xdl0.m208357U(this.f103441h, zBooleanValue ? num.intValue() : 0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m126961J(boolean z) {
        this.f103441h.f34163b.setEnabled(z);
        this.f103441h.f34163b.setClickable(z);
        ProfileLoopActionLayout profileLoopActionLayout = this.f103441h;
        if (z) {
            profileLoopActionLayout.f34163b.setBackgroundResource(e3c0.f89103f);
        } else {
            profileLoopActionLayout.f34163b.setBackgroundResource(e3c0.f89143r1);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m126962K(List<String> list) {
        this.f103446m.clear();
        if (NullChecker.m81303a(list)) {
            this.f103446m = list;
        }
        if (vwb.m200296J(list)) {
            m126961J(true);
            this.f103441h.setVisibility(0);
        } else {
            this.f103441h.setVisibility(8);
        }
        this.f103445l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m126963L(String str) {
        if (NullChecker.m81303a(str)) {
            this.f103435b.setText(str);
        }
        String string = getAct().getResources().getString(R$string.f27895n1);
        this.f103438e.setHint(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + string);
        this.f103440g.setLayoutManager(new LinearLayoutManager(getAct(), 1, false));
        this.f103440g.setOverScrollMode(0);
        C17122d c17122d = new C17122d();
        this.f103445l = c17122d;
        this.f103440g.setAdapter(c17122d);
        this.f103440g.addOnScrollListener(new C17119a());
        String str2 = m126955C().m51509a2().m51559u0().profile.studies.school;
        if (TextUtils.isEmpty(str2)) {
            m126961J(false);
        } else {
            this.f103438e.setText(str2);
            this.f103438e.setSelection(str2.length());
            m126961J(true);
        }
        this.f103438e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.cma0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f81520a.m126957F(view, z);
            }
        });
        this.f103438e.addTextChangedListener(new C17120b());
        xdl0.m208329E0(this.f103439f, new View.OnClickListener() { // from class: l.dma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86911a.m126958G(view);
            }
        });
        e51.m114744I(this.f103443j, new Runnable() { // from class: l.ema0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92191a.m126959H();
            }
        }, 300L);
        m126955C().setUpKeyboardDetectorLayout(new View(m126955C()), this.f103434a, new f30() { // from class: l.fma0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f98281a.m126960I((Boolean) obj, (Integer) obj2);
            }
        });
        this.f103441h.m52969l(this.f103443j);
        m126955C().m51509a2().m51548W0(this.f103443j);
        if (lqa.m150968f() && this.f103443j.m51595U4()) {
            String strM169801m = pj90.m169801m(this.f103443j.f33455z);
            xdl0.m208360X(this.f103435b, 0);
            if (TextUtils.isEmpty(strM169801m)) {
                return;
            }
            xdl0.m208344M(this.f103436c, true);
            xdl0.m208360X(this.f103436c, t100.m186890d(12.0f));
            xdl0.m208360X(this.f103437d, t100.m186890d(20.0f));
            this.f103436c.setTextSize(15.0f);
            this.f103436c.setTextColor(Color.parseColor("#a9a9a9"));
            this.f103436c.setText(String.format("预计符合%s人的理想型", strM169801m));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        m126955C().clearUpKeyboardListenerAndResizeChildOfContent();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m126964y(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public View m126964y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C17121c.m126968c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bma0 bma0Var) {
        this.f103444k = bma0Var;
    }

    /* JADX INFO: renamed from: l.gma0$b */
    public class C17120b implements TextWatcher {
        public C17120b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (gma0.this.f103447n && gma0.this.f103438e.isFocused()) {
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
                gma0 gma0Var = gma0.this;
                if (zIsEmpty) {
                    gma0Var.f103439f.setVisibility(8);
                    gma0.this.m126962K(null);
                } else {
                    gma0Var.f103439f.setVisibility(0);
                    gma0.this.f103444k.m102613j0(editable.toString().trim());
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
