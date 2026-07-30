package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SearchSchool;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p151v.VEditText;
import p151v.VRecyclerView;
import p153l.adc0;
import p153l.bnl0;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x1d0;
import p153l.xi5;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomSchoolTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public C8814d f34172F;

    /* JADX INFO: renamed from: G */
    public List<String> f34173G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public VEditText f34174H;

    /* JADX INFO: renamed from: I */
    public View f34175I;

    /* JADX INFO: renamed from: J */
    public VRecyclerView f34176J;

    /* JADX INFO: renamed from: K */
    public ViewGroup f34177K;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8811a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8811a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f34177K == null || !(ExpProfileLoopCustomSchoolTypeFrag.this.f34177K.getParent() instanceof ScrollView)) {
                return;
            }
            bnl0.m105505C0(ExpProfileLoopCustomSchoolTypeFrag.this.f34176J, ((ScrollView) ExpProfileLoopCustomSchoolTypeFrag.this.f34177K.getParent()).getMeasuredHeight() - qa00.m175859d(56.0f));
            ExpProfileLoopCustomSchoolTypeFrag.this.f34176J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$b */
    public class C8812b extends RecyclerView.AbstractC0584t {
        public C8812b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f34172F.getItemCount() <= 0 || i != 1) {
                return;
            }
            ExpProfileLoopCustomSchoolTypeFrag.this.act().hideInput();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$c */
    public class C8813c implements TextWatcher {
        public C8813c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f34174H.isFocused()) {
                bnl0.m105524M(ExpProfileLoopCustomSchoolTypeFrag.this.f34175I, !editable.toString().isEmpty());
                String strTrim = editable.toString().trim();
                boolean zIsEmpty = TextUtils.isEmpty(strTrim);
                ExpProfileLoopCustomSchoolTypeFrag expProfileLoopCustomSchoolTypeFrag = ExpProfileLoopCustomSchoolTypeFrag.this;
                if (zIsEmpty) {
                    expProfileLoopCustomSchoolTypeFrag.m52530p5(jyb.m147507f0(new String[0]));
                } else {
                    expProfileLoopCustomSchoolTypeFrag.m52527k5(strTrim);
                }
                ExpProfileLoopCustomSchoolTypeFrag.this.m52432R4(false);
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
    public class C8814d extends jic0<String> {
        public C8814d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m52533H(int i, View view) {
            ExpProfileLoopCustomSchoolTypeFrag.this.m52523l5(i);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return ExpProfileLoopCustomSchoolTypeFrag.this.f34173G.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(ExpProfileLoopCustomSchoolTypeFrag.this.act());
            textView.setTextColor(Color.parseColor("#e6000000"));
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            RecyclerView.C0580p c0580p = new RecyclerView.C0580p(-1, qa00.m175859d(56.0f));
            ((ViewGroup.MarginLayoutParams) c0580p).leftMargin = qa00.m175859d(20.0f);
            textView.setLayoutParams(c0580p);
            return textView;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, String str, int i, final int i2) {
            ((TextView) view).setText(getItem(i2));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.mif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f136964a.m52533H(i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) ExpProfileLoopCustomSchoolTypeFrag.this.f34173G.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ boolean m52508V4(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 || i == 5;
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ x1d0 m52509W4(x1d0 x1d0Var) {
        return x1d0Var;
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m52511Y4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public void m52523l5(int i) {
        this.f34174H.setFocusableInTouchMode(true);
        this.f34174H.clearFocus();
        if (Build.VERSION.SDK_INT < 28) {
            ((ViewGroup) this.f34174H.getParent()).requestFocus();
        }
        String item = this.f34172F.getItem(i);
        this.f34174H.setText(item);
        this.f34174H.setSelection(item.length());
        m52530p5(jyb.m147507f0(new String[0]));
        m52531s5(this.f34127A.getData().getTextType(), item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m52524o5() {
        m52426M4().m52415c2();
    }

    /* JADX INFO: renamed from: q5 */
    private C22421c<SearchSchool> m52525q5(String str) {
        final x1d0 x1d0VarM209028b = uqb0.f180376H.auth().m209043q(xi5.m211107i("/profile/schools?name=" + str)).m209032f().m209028b();
        return CoreModule.f18264c.scheduled("getSuggestSchool", 0, new pcj() { // from class: l.kif
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176659f(new pcj() { // from class: l.lif
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return ExpProfileLoopCustomSchoolTypeFrag.m52509W4(x1d0Var);
                    }
                }, SearchSchool.JSON_ADAPTER).compose(psd0.m173592C());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public void m52526r5(SearchSchool searchSchool) {
        List<String> arrayList;
        if (!NullChecker.m82486a(searchSchool) || jyb.m147479J(searchSchool.data.schools)) {
            arrayList = new ArrayList<>();
            arrayList.add("其他");
        } else {
            arrayList = searchSchool.data.schools;
        }
        m52530p5(arrayList);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125515M2, viewGroup, false);
        this.f34177K = viewGroup;
        this.f34174H = (VEditText) viewInflate.findViewById(adc0.f70517q3);
        this.f34175I = viewInflate.findViewById(adc0.f70617w1);
        this.f34176J = (VRecyclerView) viewInflate.findViewById(adc0.f70442ld);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        final ExpProfileLoopTextTypeData textType = this.f34127A.getData().getTextType();
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f34174H.setText(textType.text1);
            this.f34174H.setSelection(textType.text1.length());
        }
        bnl0.m105524M(this.f34175I, this.f34174H.length() > 0);
        VEditText vEditText = this.f34174H;
        vEditText.setSelection(vEditText.length());
        this.f34174H.setHint("填写学校名称...");
        this.f34176J.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f34176J.setOverScrollMode(0);
        C8814d c8814d = new C8814d();
        this.f34172F = c8814d;
        this.f34176J.setAdapter(c8814d);
        this.f34176J.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8811a());
        this.f34176J.addOnScrollListener(new C8812b());
        this.f34174H.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.eif
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f94142a.m52528m5(view, z);
            }
        });
        this.f34174H.addTextChangedListener(new C8813c());
        this.f34174H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.fif
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ExpProfileLoopCustomSchoolTypeFrag.m52508V4(textView, i, keyEvent);
            }
        });
        bnl0.m105509E0(this.f34175I, new View.OnClickListener() { // from class: l.gif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104487a.m52529n5(textType, view);
            }
        });
        this.f34174H.post(new Runnable() { // from class: l.hif
            @Override // java.lang.Runnable
            public final void run() {
                this.f110020a.m52524o5();
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public void m52527k5(String str) {
        if (TextUtils.isEmpty(str)) {
            m52526r5(null);
        } else {
            m52525q5(str).subscribe(psd0.m173597H(new y20() { // from class: l.iif
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f115087a.m52526r5((SearchSchool) obj);
                }
            }, new y20() { // from class: l.jif
                @Override // p153l.y20
                public final void call(Object obj) {
                    ExpProfileLoopCustomSchoolTypeFrag.m52511Y4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m52528m5(View view, boolean z) {
        this.f34174H.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m52529n5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, View view) {
        this.f34174H.setText("");
        bnl0.m105524M(this.f34175I, false);
        this.f34174H.requestFocus();
        expProfileLoopTextTypeData.text1 = "";
        m52432R4(true);
    }

    /* JADX INFO: renamed from: p5 */
    public void m52530p5(List<String> list) {
        this.f34173G.clear();
        if (NullChecker.m82486a(list)) {
            this.f34173G = list;
        }
        this.f34172F.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: s5 */
    public final void m52531s5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, String str) {
        expProfileLoopTextTypeData.text1 = str;
        m52432R4((TextUtils.isEmpty(str) || TextUtils.isEmpty(expProfileLoopTextTypeData.text1.trim())) ? false : true);
    }
}
