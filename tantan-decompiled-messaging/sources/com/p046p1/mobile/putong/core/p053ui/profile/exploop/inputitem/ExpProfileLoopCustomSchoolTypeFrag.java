package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SearchSchool;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p147v.VEditText;
import p147v.VRecyclerView;
import p149l.dac0;
import p149l.e30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.qib0;
import p149l.stc0;
import p149l.t100;
import p149l.u4c0;
import p149l.v9j;
import p149l.vwb;
import p149l.xdl0;
import p149l.xh5;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomSchoolTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public C8651d f33324F;

    /* JADX INFO: renamed from: G */
    public List<String> f33325G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public VEditText f33326H;

    /* JADX INFO: renamed from: I */
    public View f33327I;

    /* JADX INFO: renamed from: J */
    public VRecyclerView f33328J;

    /* JADX INFO: renamed from: K */
    public ViewGroup f33329K;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8648a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC8648a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f33329K == null || !(ExpProfileLoopCustomSchoolTypeFrag.this.f33329K.getParent() instanceof ScrollView)) {
                return;
            }
            xdl0.m208325C0(ExpProfileLoopCustomSchoolTypeFrag.this.f33328J, ((ScrollView) ExpProfileLoopCustomSchoolTypeFrag.this.f33329K.getParent()).getMeasuredHeight() - t100.m186890d(56.0f));
            ExpProfileLoopCustomSchoolTypeFrag.this.f33328J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$b */
    public class C8649b extends RecyclerView.AbstractC0582t {
        public C8649b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull @NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f33324F.getItemCount() <= 0 || i != 1) {
                return;
            }
            ExpProfileLoopCustomSchoolTypeFrag.this.act().hideInput();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull @NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSchoolTypeFrag$c */
    public class C8650c implements TextWatcher {
        public C8650c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (ExpProfileLoopCustomSchoolTypeFrag.this.f33326H.isFocused()) {
                xdl0.m208344M(ExpProfileLoopCustomSchoolTypeFrag.this.f33327I, !editable.toString().isEmpty());
                String strTrim = editable.toString().trim();
                boolean zIsEmpty = TextUtils.isEmpty(strTrim);
                ExpProfileLoopCustomSchoolTypeFrag expProfileLoopCustomSchoolTypeFrag = ExpProfileLoopCustomSchoolTypeFrag.this;
                if (zIsEmpty) {
                    expProfileLoopCustomSchoolTypeFrag.m51347p5(vwb.m200324f0(new String[0]));
                } else {
                    expProfileLoopCustomSchoolTypeFrag.m51344k5(strTrim);
                }
                ExpProfileLoopCustomSchoolTypeFrag.this.m51249R4(false);
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
    public class C8651d extends dac0<String> {
        public C8651d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m51350H(int i, View view) {
            ExpProfileLoopCustomSchoolTypeFrag.this.m51340l5(i);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return ExpProfileLoopCustomSchoolTypeFrag.this.f33325G.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            TextView textView = new TextView(ExpProfileLoopCustomSchoolTypeFrag.this.act());
            textView.setTextColor(Color.parseColor("#e6000000"));
            textView.setTextSize(16.0f);
            textView.setGravity(16);
            RecyclerView.C0578p c0578p = new RecyclerView.C0578p(-1, t100.m186890d(56.0f));
            ((ViewGroup.MarginLayoutParams) c0578p).leftMargin = t100.m186890d(20.0f);
            textView.setLayoutParams(c0578p);
            return textView;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, String str, int i, final int i2) {
            ((TextView) view).setText(getItem(i2));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ghf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f102656a.m51350H(i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return (String) ExpProfileLoopCustomSchoolTypeFrag.this.f33325G.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ boolean m51325V4(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6 || i == 5;
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ stc0 m51326W4(stc0 stc0Var) {
        return stc0Var;
    }

    /* JADX INFO: renamed from: Y4 */
    public static /* synthetic */ void m51328Y4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public void m51340l5(int i) {
        this.f33326H.setFocusableInTouchMode(true);
        this.f33326H.clearFocus();
        if (Build.VERSION.SDK_INT < 28) {
            ((ViewGroup) this.f33326H.getParent()).requestFocus();
        }
        String item = this.f33324F.getItem(i);
        this.f33326H.setText(item);
        this.f33326H.setSelection(item.length());
        m51347p5(vwb.m200324f0(new String[0]));
        m51348s5(this.f33279A.getData().getTextType(), item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m51341o5() {
        m51243M4().m51232b2();
    }

    /* JADX INFO: renamed from: q5 */
    private C22306c<SearchSchool> m51342q5(String str) {
        final stc0 stc0VarM185883b = qib0.f154693H.auth().m185898q(xh5.m208761i("/profile/schools?name=" + str)).m185887f().m185883b();
        return CoreModule.f17545c.scheduled("getSuggestSchool", 0, new v9j() { // from class: l.ehf
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135122f(new v9j() { // from class: l.fhf
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return ExpProfileLoopCustomSchoolTypeFrag.m51326W4(stc0Var);
                    }
                }, SearchSchool.JSON_ADAPTER).compose(mkd0.m154951C());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public void m51343r5(SearchSchool searchSchool) {
        List<String> arrayList;
        if (!NullChecker.m81303a(searchSchool) || vwb.m200296J(searchSchool.data.schools)) {
            arrayList = new ArrayList<>();
            arrayList.add("其他");
        } else {
            arrayList = searchSchool.data.schools;
        }
        m51347p5(arrayList);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95461M2, viewGroup, false);
        this.f33329K = viewGroup;
        this.f33326H = (VEditText) viewInflate.findViewById(u4c0.f174392o3);
        this.f33327I = viewInflate.findViewById(u4c0.f174526w1);
        this.f33328J = (VRecyclerView) viewInflate.findViewById(u4c0.f174317jd);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        final ExpProfileLoopTextTypeData textType = this.f33279A.getData().getTextType();
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f33326H.setText(textType.text1);
            this.f33326H.setSelection(textType.text1.length());
        }
        xdl0.m208344M(this.f33327I, this.f33326H.length() > 0);
        VEditText vEditText = this.f33326H;
        vEditText.setSelection(vEditText.length());
        this.f33326H.setHint("填写学校名称...");
        this.f33328J.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f33328J.setOverScrollMode(0);
        C8651d c8651d = new C8651d();
        this.f33324F = c8651d;
        this.f33328J.setAdapter(c8651d);
        this.f33328J.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8648a());
        this.f33328J.addOnScrollListener(new C8649b());
        this.f33326H.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ygf
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f198162a.m51345m5(view, z);
            }
        });
        this.f33326H.addTextChangedListener(new C8650c());
        this.f33326H.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.zgf
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ExpProfileLoopCustomSchoolTypeFrag.m51325V4(textView, i, keyEvent);
            }
        });
        xdl0.m208329E0(this.f33327I, new View.OnClickListener() { // from class: l.ahf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69596a.m51346n5(textType, view);
            }
        });
        this.f33326H.post(new Runnable() { // from class: l.bhf
            @Override // java.lang.Runnable
            public final void run() {
                this.f75601a.m51341o5();
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public void m51344k5(String str) {
        if (TextUtils.isEmpty(str)) {
            m51343r5(null);
        } else {
            m51342q5(str).subscribe(mkd0.m154956H(new e30() { // from class: l.chf
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80866a.m51343r5((SearchSchool) obj);
                }
            }, new e30() { // from class: l.dhf
                @Override // p149l.e30
                public final void call(Object obj) {
                    ExpProfileLoopCustomSchoolTypeFrag.m51328Y4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m51345m5(View view, boolean z) {
        this.f33326H.setCursorVisible(z);
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m51346n5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, View view) {
        this.f33326H.setText("");
        xdl0.m208344M(this.f33327I, false);
        this.f33326H.requestFocus();
        expProfileLoopTextTypeData.text1 = "";
        m51249R4(true);
    }

    /* JADX INFO: renamed from: p5 */
    public void m51347p5(List<String> list) {
        this.f33325G.clear();
        if (NullChecker.m81303a(list)) {
            this.f33325G = list;
        }
        this.f33324F.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: s5 */
    public final void m51348s5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, String str) {
        expProfileLoopTextTypeData.text1 = str;
        m51249R4((TextUtils.isEmpty(str) || TextUtils.isEmpty(expProfileLoopTextTypeData.text1.trim())) ? false : true);
    }
}
