package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SearchSchool;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f6c0;
import l.ia20;
import l.mkd0;
import l.qib0;
import l.stc0;
import l.t100;
import l.u4c0;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.xh5;
import org.jetbrains.annotations.NotNull;
import rx.c;
import v.VEditText;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomSchoolTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public C0076d f1146F;

    /* JADX INFO: renamed from: G */
    public List<String> f1147G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public VEditText f1148H;

    /* JADX INFO: renamed from: I */
    public View f1149I;

    /* JADX INFO: renamed from: J */
    public VRecyclerView f1150J;

    /* JADX INFO: renamed from: K */
    public ViewGroup f1151K;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0073a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0073a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f1151K == null || !(ExpProfileLoopCustomSchoolTypeFrag.this.f1151K.getParent() instanceof ScrollView)) {
                return;
            }
            xdl0.C0(ExpProfileLoopCustomSchoolTypeFrag.this.f1150J, ((ScrollView) ExpProfileLoopCustomSchoolTypeFrag.this.f1151K.getParent()).getMeasuredHeight() - t100.d(56.0f));
            ExpProfileLoopCustomSchoolTypeFrag.this.f1150J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$b */
    public class C0074b extends RecyclerView.t {
        public C0074b() {
        }

        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f1146F.getItemCount() <= 0 || i != 1) {
                return;
            }
            ExpProfileLoopCustomSchoolTypeFrag.this.act().hideInput();
        }

        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$c */
    public class C0075c implements TextWatcher {
        public C0075c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f1148H.isFocused()) {
                xdl0.M(ExpProfileLoopCustomSchoolTypeFrag.this.f1149I, !editable.toString().isEmpty());
                String strTrim = editable.toString().trim();
                boolean zIsEmpty = TextUtils.isEmpty(strTrim);
                ExpProfileLoopCustomSchoolTypeFrag expProfileLoopCustomSchoolTypeFrag = ExpProfileLoopCustomSchoolTypeFrag.this;
                if (zIsEmpty) {
                    expProfileLoopCustomSchoolTypeFrag.m1817p5(vwb.f0(new String[0]));
                } else {
                    expProfileLoopCustomSchoolTypeFrag.m1814k5(strTrim);
                }
                ExpProfileLoopCustomSchoolTypeFrag.this.m1704R4(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$d */
    public class C0076d extends dac0<String> {
        public C0076d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m1820H(int i, View view) {
            ExpProfileLoopCustomSchoolTypeFrag.this.m1809l5(i);
        }

        /* JADX INFO: renamed from: C */
        public int m1822C() {
            return ExpProfileLoopCustomSchoolTypeFrag.this.f1147G.size();
        }

        /* JADX INFO: renamed from: D */
        public View m1823D(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(ExpProfileLoopCustomSchoolTypeFrag.this.act());
            textView.setTextColor(Color.parseColor("#e6000000"));
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            RecyclerView.p pVar = new RecyclerView.p(-1, t100.d(56.0f));
            ((ViewGroup.MarginLayoutParams) pVar).leftMargin = t100.d(20.0f);
            textView.setLayoutParams(pVar);
            return textView;
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m1821A(View view, String str, int i, final int i2) {
            ((TextView) view).setText(getItem(i2));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.ghf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11440a.m1820H(i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) ExpProfileLoopCustomSchoolTypeFrag.this.f1147G.get(i);
        }

        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ boolean m1794V4(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 || i == 5;
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ stc0 m1795W4(stc0 stc0Var) {
        return stc0Var;
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m1797Y4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public void m1809l5(int i) {
        this.f1148H.setFocusableInTouchMode(true);
        this.f1148H.clearFocus();
        if (Build.VERSION.SDK_INT < 28) {
            ((ViewGroup) this.f1148H.getParent()).requestFocus();
        }
        String item = this.f1146F.getItem(i);
        this.f1148H.setText(item);
        this.f1148H.setSelection(item.length());
        m1817p5(vwb.f0(new String[0]));
        m1818s5(this.f1101A.getData().getTextType(), item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m1810o5() {
        m1698M4().m1687b2();
    }

    /* JADX INFO: renamed from: q5 */
    private c<SearchSchool> m1811q5(String str) {
        final stc0 stc0VarB = qib0.H.auth().q(xh5.i("/profile/schools?name=" + str)).f().b();
        return CoreModule.c.scheduled("getSuggestSchool", 0, new v9j() { // from class: l.ehf
            public final Object call() {
                return ia20.f(new v9j() { // from class: l.fhf
                    public final Object call() {
                        return ExpProfileLoopCustomSchoolTypeFrag.m1795W4(stc0Var);
                    }
                }, SearchSchool.JSON_ADAPTER).compose(mkd0.C());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public void m1812r5(SearchSchool searchSchool) {
        List<String> arrayList;
        if (!NullChecker.a(searchSchool) || vwb.J(searchSchool.data.schools)) {
            arrayList = new ArrayList<>();
            arrayList.add("其他");
        } else {
            arrayList = searchSchool.data.schools;
        }
        m1817p5(arrayList);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.M2, viewGroup, false);
        this.f1151K = viewGroup;
        this.f1148H = viewInflate.findViewById(u4c0.o3);
        this.f1149I = viewInflate.findViewById(u4c0.w1);
        this.f1150J = viewInflate.findViewById(u4c0.jd);
        return viewInflate;
    }

    /* JADX INFO: renamed from: g4 */
    public void m1813g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        final ExpProfileLoopTextTypeData textType = this.f1101A.getData().getTextType();
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f1148H.setText(textType.text1);
            this.f1148H.setSelection(textType.text1.length());
        }
        xdl0.M(this.f1149I, this.f1148H.length() > 0);
        VEditText vEditText = this.f1148H;
        vEditText.setSelection(vEditText.length());
        this.f1148H.setHint("填写学校名称...");
        this.f1150J.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f1150J.setOverScrollMode(0);
        C0076d c0076d = new C0076d();
        this.f1146F = c0076d;
        this.f1150J.setAdapter(c0076d);
        this.f1150J.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0073a());
        this.f1150J.addOnScrollListener(new C0074b());
        this.f1148H.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ygf
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f22876a.m1815m5(view, z);
            }
        });
        this.f1148H.addTextChangedListener(new C0075c());
        this.f1148H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.zgf
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ExpProfileLoopCustomSchoolTypeFrag.m1794V4(textView, i, keyEvent);
            }
        });
        xdl0.E0(this.f1149I, new View.OnClickListener() { // from class: l.ahf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7618a.m1816n5(textType, view);
            }
        });
        this.f1148H.post(new Runnable() { // from class: l.bhf
            @Override // java.lang.Runnable
            public final void run() {
                this.f8135a.m1810o5();
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public void m1814k5(String str) {
        if (TextUtils.isEmpty(str)) {
            m1812r5(null);
        } else {
            m1811q5(str).subscribe(mkd0.H(new e30() { // from class: l.chf
                public final void call(Object obj) {
                    this.f8674a.m1812r5((SearchSchool) obj);
                }
            }, new e30() { // from class: l.dhf
                public final void call(Object obj) {
                    ExpProfileLoopCustomSchoolTypeFrag.m1797Y4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m1815m5(View view, boolean z) {
        this.f1148H.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m1816n5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, View view) {
        this.f1148H.setText("");
        xdl0.M(this.f1149I, false);
        this.f1148H.requestFocus();
        expProfileLoopTextTypeData.text1 = "";
        m1704R4(true);
    }

    /* JADX INFO: renamed from: p5 */
    public void m1817p5(List<String> list) {
        this.f1147G.clear();
        if (NullChecker.a(list)) {
            this.f1147G = list;
        }
        this.f1146F.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: s5 */
    public final void m1818s5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, String str) {
        expProfileLoopTextTypeData.text1 = str;
        m1704R4((TextUtils.isEmpty(str) || TextUtils.isEmpty(expProfileLoopTextTypeData.text1.trim())) ? false : true);
    }
}
