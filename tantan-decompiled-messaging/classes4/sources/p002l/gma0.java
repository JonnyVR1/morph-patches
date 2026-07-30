package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.school.ProfileLoopSelectSchoolFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e3c0;
import l.e51;
import l.f30;
import l.lqa;
import l.n6c0;
import l.pj90;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VEditText;
import v.VImage;
import v.VRecyclerView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gma0 implements s7m<bma0> {

    /* JADX INFO: renamed from: a */
    public VRelative f11513a;

    /* JADX INFO: renamed from: b */
    public TextView f11514b;

    /* JADX INFO: renamed from: c */
    public TextView f11515c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f11516d;

    /* JADX INFO: renamed from: e */
    public VEditText f11517e;

    /* JADX INFO: renamed from: f */
    public VImage f11518f;

    /* JADX INFO: renamed from: g */
    public VRecyclerView f11519g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopActionLayout f11520h;

    /* JADX INFO: renamed from: i */
    public final Context f11521i;

    /* JADX INFO: renamed from: j */
    public final ProfileLoopSelectSchoolFrag f11522j;

    /* JADX INFO: renamed from: k */
    public bma0 f11523k;

    /* JADX INFO: renamed from: l */
    public C0596d f11524l;

    /* JADX INFO: renamed from: m */
    public List<String> f11525m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f11526n = true;

    /* JADX INFO: renamed from: l.gma0$a */
    public class C0593a extends RecyclerView.t {
        public C0593a() {
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (gma0.this.f11524l.getItemCount() <= 0 || i != 1) {
                return;
            }
            gma0.this.m13920C().hideInput();
        }

        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.gma0$c */
    public static class C0595c {
        /* JADX INFO: renamed from: b */
        public static void m13934b(gma0 gma0Var, View view) {
            gma0Var.f11513a = (VRelative) view;
            ViewGroup viewGroup = (ViewGroup) view;
            gma0Var.f11514b = (TextView) viewGroup.getChildAt(0);
            gma0Var.f11515c = (TextView) viewGroup.getChildAt(1);
            gma0Var.f11516d = (RelativeLayout) viewGroup.getChildAt(2);
            gma0Var.f11517e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
            gma0Var.f11518f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
            gma0Var.f11519g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
            gma0Var.f11520h = (ProfileLoopActionLayout) viewGroup.getChildAt(4);
        }

        /* JADX INFO: renamed from: c */
        public static View m13935c(gma0 gma0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.M0, viewGroup, false);
            m13934b(gma0Var, viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.gma0$d */
    public class C0596d extends dac0<String> {
        public C0596d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m13937H(int i, View view) {
            gma0.this.m13922E(i);
        }

        /* JADX INFO: renamed from: C */
        public int m13939C() {
            return gma0.this.f11525m.size();
        }

        /* JADX INFO: renamed from: D */
        public View m13940D(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(gma0.this.act());
            textView.setTextColor(Color.parseColor("#212121"));
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            RecyclerView.p pVar = new RecyclerView.p(-1, t100.d(56.0f));
            ((ViewGroup.MarginLayoutParams) pVar).leftMargin = t100.d(16.0f);
            textView.setLayoutParams(pVar);
            return textView;
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m13938A(View view, String str, int i, final int i2) {
            ((TextView) view).setText(getItem(i2));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.hma0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f12110a.m13937H(i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) gma0.this.f11525m.get(i);
        }

        public long getItemId(int i) {
            return i;
        }
    }

    public gma0(Context context, ProfileLoopSelectSchoolFrag profileLoopSelectSchoolFrag) {
        this.f11521i = context;
        this.f11522j = profileLoopSelectSchoolFrag;
    }

    /* JADX INFO: renamed from: A */
    public void m13918A(User user) {
        LoopFragmentFactory.m1973l(user, LoopInputType.SCHOOL_NEW, "", this.f11517e.getText().toString(), 0);
    }

    /* JADX INFO: renamed from: B */
    public Bundle m13919B() {
        return this.f11522j.getArguments();
    }

    /* JADX INFO: renamed from: C */
    public ProfileInfoLoopEditAct m13920C() {
        return (ProfileInfoLoopEditAct) this.f11521i;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13921C0() {
        return this.f11521i;
    }

    /* JADX INFO: renamed from: E */
    public final void m13922E(int i) {
        this.f11514b.setFocusableInTouchMode(true);
        this.f11517e.clearFocus();
        String item = this.f11524l.getItem(i);
        this.f11517e.setText(item);
        this.f11517e.setSelection(item.length());
        m13928K(null);
        m13927J(true);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m13923F(View view, boolean z) {
        this.f11517e.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m13924G(View view) {
        this.f11526n = true;
        this.f11517e.setText("");
        this.f11518f.setVisibility(8);
        m13928K(null);
        this.f11517e.requestFocus();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m13925H() {
        this.f11517e.requestFocus();
        m13920C().showInput(this.f11517e, 0);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m13926I(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        this.f11526n = zBooleanValue;
        if (Build.VERSION.SDK_INT > 34) {
            xdl0.U(this.f11520h, zBooleanValue ? num.intValue() : 0);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m13927J(boolean z) {
        this.f11520h.f1985b.setEnabled(z);
        this.f11520h.f1985b.setClickable(z);
        ProfileLoopActionLayout profileLoopActionLayout = this.f11520h;
        if (z) {
            profileLoopActionLayout.f1985b.setBackgroundResource(e3c0.f);
        } else {
            profileLoopActionLayout.f1985b.setBackgroundResource(e3c0.r1);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m13928K(List<String> list) {
        this.f11525m.clear();
        if (NullChecker.a(list)) {
            this.f11525m = list;
        }
        if (vwb.J(list)) {
            m13927J(true);
            this.f11520h.setVisibility(0);
        } else {
            this.f11520h.setVisibility(8);
        }
        this.f11524l.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m13929L(String str) {
        if (NullChecker.a(str)) {
            this.f11514b.setText(str);
        }
        String string = act().getResources().getString(R.string.n1);
        this.f11517e.setHint(" " + string);
        this.f11519g.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f11519g.setOverScrollMode(0);
        C0596d c0596d = new C0596d();
        this.f11524l = c0596d;
        this.f11519g.setAdapter(c0596d);
        this.f11519g.addOnScrollListener(new C0593a());
        String str2 = m13920C().m1991a2().m2043u0().profile.studies.school;
        if (TextUtils.isEmpty(str2)) {
            m13927J(false);
        } else {
            this.f11517e.setText(str2);
            this.f11517e.setSelection(str2.length());
            m13927J(true);
        }
        this.f11517e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.cma0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f8744a.m13923F(view, z);
            }
        });
        this.f11517e.addTextChangedListener(new C0594b());
        xdl0.E0(this.f11518f, new View.OnClickListener() { // from class: l.dma0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9333a.m13924G(view);
            }
        });
        e51.I(this.f11522j, new Runnable() { // from class: l.ema0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9870a.m13925H();
            }
        }, 300L);
        m13920C().setUpKeyboardDetectorLayout(new View(m13920C()), this.f11513a, new f30() { // from class: l.fma0
            public final void call(Object obj, Object obj2) {
                this.f10485a.m13926I((Boolean) obj, (Integer) obj2);
            }
        });
        this.f11520h.m3527l(this.f11522j);
        m13920C().m1991a2().m2030W0(this.f11522j);
        if (lqa.f() && this.f11522j.m2081U4()) {
            String strM = pj90.m(this.f11522j.f1277z);
            xdl0.X(this.f11514b, 0);
            if (TextUtils.isEmpty(strM)) {
                return;
            }
            xdl0.M(this.f11515c, true);
            xdl0.X(this.f11515c, t100.d(12.0f));
            xdl0.X(this.f11516d, t100.d(20.0f));
            this.f11515c.setTextSize(15.0f);
            this.f11515c.setTextColor(Color.parseColor("#a9a9a9"));
            this.f11515c.setText(String.format("预计符合%s人的理想型", strM));
        }
    }

    public void destroy() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        m13920C().clearUpKeyboardListenerAndResizeChildOfContent();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13931y(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public View m13931y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0595c.m13935c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void m13930i1(bma0 bma0Var) {
        this.f11523k = bma0Var;
    }

    /* JADX INFO: renamed from: l.gma0$b */
    public class C0594b implements TextWatcher {
        public C0594b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (gma0.this.f11526n && gma0.this.f11517e.isFocused()) {
                boolean zIsEmpty = TextUtils.isEmpty(editable.toString());
                gma0 gma0Var = gma0.this;
                if (zIsEmpty) {
                    gma0Var.f11518f.setVisibility(8);
                    gma0.this.m13928K(null);
                } else {
                    gma0Var.f11518f.setVisibility(0);
                    gma0.this.f11523k.m10475j0(editable.toString().trim());
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
