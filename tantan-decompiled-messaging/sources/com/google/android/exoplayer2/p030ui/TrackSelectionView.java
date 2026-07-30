package com.google.android.exoplayer2.p030ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.brd;
import p149l.d7c0;
import p149l.l6j0;
import p149l.p11;
import p149l.u6j0;
import p149l.z5j0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f9405a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflater f9406b;

    /* JADX INFO: renamed from: c */
    public final CheckedTextView f9407c;

    /* JADX INFO: renamed from: d */
    public final CheckedTextView f9408d;

    /* JADX INFO: renamed from: e */
    public final ViewOnClickListenerC2033b f9409e;

    /* JADX INFO: renamed from: f */
    public final List<C1838d0.a> f9410f;

    /* JADX INFO: renamed from: g */
    public final Map<z5j0, u6j0> f9411g;

    /* JADX INFO: renamed from: h */
    public boolean f9412h;

    /* JADX INFO: renamed from: i */
    public boolean f9413i;

    /* JADX INFO: renamed from: j */
    public l6j0 f9414j;

    /* JADX INFO: renamed from: k */
    public CheckedTextView[][] f9415k;

    /* JADX INFO: renamed from: l */
    public boolean f9416l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Comparator<C2034c> f9417m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public class ViewOnClickListenerC2033b implements View.OnClickListener {
        public ViewOnClickListenerC2033b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m12046c(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    public static final class C2034c {

        /* JADX INFO: renamed from: a */
        public final C1838d0.a f9419a;

        /* JADX INFO: renamed from: b */
        public final int f9420b;

        public C2034c(C1838d0.a aVar, int i) {
            this.f9419a = aVar;
            this.f9420b = i;
        }

        /* JADX INFO: renamed from: a */
        public C1871k m12054a() {
            return this.f9419a.m9794c(this.f9420b);
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f9405a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f9406b = layoutInflaterFrom;
        ViewOnClickListenerC2033b viewOnClickListenerC2033b = new ViewOnClickListenerC2033b();
        this.f9409e = viewOnClickListenerC2033b;
        this.f9414j = new brd(getResources());
        this.f9410f = new ArrayList();
        this.f9411g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9407c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.f9294x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC2033b);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(d7c0.f84726a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9408d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.f9293w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC2033b);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: b */
    public static Map<z5j0, u6j0> m12045b(Map<z5j0, u6j0> map, List<C1838d0.a> list, boolean z) {
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            u6j0 u6j0Var = map.get(list.get(i).m9793b());
            if (u6j0Var != null && (z || map2.isEmpty())) {
                map2.put(u6j0Var.f174845a, u6j0Var);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: c */
    public final void m12046c(View view) {
        if (view == this.f9407c) {
            m12048e();
        } else if (view == this.f9408d) {
            m12047d();
        } else {
            m12049f(view);
        }
        m12052i();
    }

    /* JADX INFO: renamed from: d */
    public final void m12047d() {
        this.f9416l = false;
        this.f9411g.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m12048e() {
        this.f9416l = true;
        this.f9411g.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m12049f(View view) {
        this.f9416l = false;
        C2034c c2034c = (C2034c) p11.m167011e(view.getTag());
        z5j0 z5j0VarM9793b = c2034c.f9419a.m9793b();
        int i = c2034c.f9420b;
        u6j0 u6j0Var = this.f9411g.get(z5j0VarM9793b);
        if (u6j0Var == null) {
            if (!this.f9413i && this.f9411g.size() > 0) {
                this.f9411g.clear();
            }
            this.f9411g.put(z5j0VarM9793b, new u6j0(z5j0VarM9793b, ImmutableList.m15686of(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(u6j0Var.f174846b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zM12050g = m12050g(c2034c.f9419a);
        boolean z = zM12050g || m12051h();
        if (zIsChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            boolean zIsEmpty = arrayList.isEmpty();
            Map<z5j0, u6j0> map = this.f9411g;
            if (zIsEmpty) {
                map.remove(z5j0VarM9793b);
                return;
            } else {
                map.put(z5j0VarM9793b, new u6j0(z5j0VarM9793b, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zM12050g) {
            this.f9411g.put(z5j0VarM9793b, new u6j0(z5j0VarM9793b, ImmutableList.m15686of(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.f9411g.put(z5j0VarM9793b, new u6j0(z5j0VarM9793b, arrayList));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12050g(C1838d0.a aVar) {
        return this.f9412h && aVar.m9796e();
    }

    public boolean getIsDisabled() {
        return this.f9416l;
    }

    public Map<z5j0, u6j0> getOverrides() {
        return this.f9411g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12051h() {
        return this.f9413i && this.f9410f.size() > 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m12052i() {
        this.f9407c.setChecked(this.f9416l);
        this.f9408d.setChecked(!this.f9416l && this.f9411g.size() == 0);
        for (int i = 0; i < this.f9415k.length; i++) {
            u6j0 u6j0Var = this.f9411g.get(this.f9410f.get(i).m9793b());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f9415k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (u6j0Var != null) {
                        this.f9415k[i][i2].setChecked(u6j0Var.f174846b.contains(Integer.valueOf(((C2034c) p11.m167011e(checkedTextViewArr[i2].getTag())).f9420b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12053j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        boolean zIsEmpty = this.f9410f.isEmpty();
        CheckedTextView checkedTextView = this.f9407c;
        if (zIsEmpty) {
            checkedTextView.setEnabled(false);
            this.f9408d.setEnabled(false);
            return;
        }
        checkedTextView.setEnabled(true);
        this.f9408d.setEnabled(true);
        this.f9415k = new CheckedTextView[this.f9410f.size()][];
        boolean zM12051h = m12051h();
        for (int i = 0; i < this.f9410f.size(); i++) {
            C1838d0.a aVar = this.f9410f.get(i);
            boolean zM12050g = m12050g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f9415k;
            int i2 = aVar.f7369a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            C2034c[] c2034cArr = new C2034c[i2];
            for (int i3 = 0; i3 < aVar.f7369a; i3++) {
                c2034cArr[i3] = new C2034c(aVar, i3);
            }
            Comparator<C2034c> comparator = this.f9417m;
            if (comparator != null) {
                Arrays.sort(c2034cArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.f9406b.inflate(d7c0.f84726a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView2 = (CheckedTextView) this.f9406b.inflate((zM12050g || zM12051h) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView2.setBackgroundResource(this.f9405a);
                checkedTextView2.setText(this.f9414j.mo103529a(c2034cArr[i4].m12054a()));
                checkedTextView2.setTag(c2034cArr[i4]);
                if (aVar.m9800i(i4)) {
                    checkedTextView2.setFocusable(true);
                    checkedTextView2.setOnClickListener(this.f9409e);
                } else {
                    checkedTextView2.setFocusable(false);
                    checkedTextView2.setEnabled(false);
                }
                this.f9415k[i][i4] = checkedTextView2;
                addView(checkedTextView2);
            }
        }
        m12052i();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f9412h != z) {
            this.f9412h = z;
            m12053j();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f9413i != z) {
            this.f9413i = z;
            if (!z && this.f9411g.size() > 1) {
                Map<z5j0, u6j0> mapM12045b = m12045b(this.f9411g, this.f9410f, false);
                this.f9411g.clear();
                this.f9411g.putAll(mapM12045b);
            }
            m12053j();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f9407c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(l6j0 l6j0Var) {
        this.f9414j = (l6j0) p11.m167011e(l6j0Var);
        m12053j();
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
