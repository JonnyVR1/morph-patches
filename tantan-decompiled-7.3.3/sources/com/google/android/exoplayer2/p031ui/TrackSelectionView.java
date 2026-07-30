package com.google.android.exoplayer2.p031ui;

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
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1894k;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.dfj0;
import p153l.hfc0;
import p153l.pfj0;
import p153l.qsd;
import p153l.w11;
import p153l.yfj0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final int f9442a;

    /* JADX INFO: renamed from: b */
    public final LayoutInflater f9443b;

    /* JADX INFO: renamed from: c */
    public final CheckedTextView f9444c;

    /* JADX INFO: renamed from: d */
    public final CheckedTextView f9445d;

    /* JADX INFO: renamed from: e */
    public final ViewOnClickListenerC2056b f9446e;

    /* JADX INFO: renamed from: f */
    public final List<C1861d0.a> f9447f;

    /* JADX INFO: renamed from: g */
    public final Map<dfj0, yfj0> f9448g;

    /* JADX INFO: renamed from: h */
    public boolean f9449h;

    /* JADX INFO: renamed from: i */
    public boolean f9450i;

    /* JADX INFO: renamed from: j */
    public pfj0 f9451j;

    /* JADX INFO: renamed from: k */
    public CheckedTextView[][] f9452k;

    /* JADX INFO: renamed from: l */
    public boolean f9453l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Comparator<C2057c> f9454m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    public class ViewOnClickListenerC2056b implements View.OnClickListener {
        public ViewOnClickListenerC2056b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.m12100c(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    public static final class C2057c {

        /* JADX INFO: renamed from: a */
        public final C1861d0.a f9456a;

        /* JADX INFO: renamed from: b */
        public final int f9457b;

        public C2057c(C1861d0.a aVar, int i) {
            this.f9456a = aVar;
            this.f9457b = i;
        }

        /* JADX INFO: renamed from: a */
        public C1894k m12108a() {
            return this.f9456a.m9848c(this.f9457b);
        }
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f9442a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f9443b = layoutInflaterFrom;
        ViewOnClickListenerC2056b viewOnClickListenerC2056b = new ViewOnClickListenerC2056b();
        this.f9446e = viewOnClickListenerC2056b;
        this.f9451j = new qsd(getResources());
        this.f9447f = new ArrayList();
        this.f9448g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9444c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.f9331x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC2056b);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(hfc0.f109268a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9445d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.f9330w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC2056b);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: b */
    public static Map<dfj0, yfj0> m12099b(Map<dfj0, yfj0> map, List<C1861d0.a> list, boolean z) {
        HashMap map2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            yfj0 yfj0Var = map.get(list.get(i).m9847b());
            if (yfj0Var != null && (z || map2.isEmpty())) {
                map2.put(yfj0Var.f199533a, yfj0Var);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: c */
    public final void m12100c(View view) {
        if (view == this.f9444c) {
            m12102e();
        } else if (view == this.f9445d) {
            m12101d();
        } else {
            m12103f(view);
        }
        m12106i();
    }

    /* JADX INFO: renamed from: d */
    public final void m12101d() {
        this.f9453l = false;
        this.f9448g.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m12102e() {
        this.f9453l = true;
        this.f9448g.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m12103f(View view) {
        this.f9453l = false;
        C2057c c2057c = (C2057c) w11.m204369e(view.getTag());
        dfj0 dfj0VarM9847b = c2057c.f9456a.m9847b();
        int i = c2057c.f9457b;
        yfj0 yfj0Var = this.f9448g.get(dfj0VarM9847b);
        if (yfj0Var == null) {
            if (!this.f9450i && this.f9448g.size() > 0) {
                this.f9448g.clear();
            }
            this.f9448g.put(dfj0VarM9847b, new yfj0(dfj0VarM9847b, ImmutableList.m15740of(Integer.valueOf(i))));
            return;
        }
        ArrayList arrayList = new ArrayList(yfj0Var.f199534b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zM12104g = m12104g(c2057c.f9456a);
        boolean z = zM12104g || m12105h();
        if (zIsChecked && z) {
            arrayList.remove(Integer.valueOf(i));
            boolean zIsEmpty = arrayList.isEmpty();
            Map<dfj0, yfj0> map = this.f9448g;
            if (zIsEmpty) {
                map.remove(dfj0VarM9847b);
                return;
            } else {
                map.put(dfj0VarM9847b, new yfj0(dfj0VarM9847b, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zM12104g) {
            this.f9448g.put(dfj0VarM9847b, new yfj0(dfj0VarM9847b, ImmutableList.m15740of(Integer.valueOf(i))));
        } else {
            arrayList.add(Integer.valueOf(i));
            this.f9448g.put(dfj0VarM9847b, new yfj0(dfj0VarM9847b, arrayList));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m12104g(C1861d0.a aVar) {
        return this.f9449h && aVar.m9850e();
    }

    public boolean getIsDisabled() {
        return this.f9453l;
    }

    public Map<dfj0, yfj0> getOverrides() {
        return this.f9448g;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12105h() {
        return this.f9450i && this.f9447f.size() > 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m12106i() {
        this.f9444c.setChecked(this.f9453l);
        this.f9445d.setChecked(!this.f9453l && this.f9448g.size() == 0);
        for (int i = 0; i < this.f9452k.length; i++) {
            yfj0 yfj0Var = this.f9448g.get(this.f9447f.get(i).m9847b());
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f9452k[i];
                if (i2 < checkedTextViewArr.length) {
                    if (yfj0Var != null) {
                        this.f9452k[i][i2].setChecked(yfj0Var.f199534b.contains(Integer.valueOf(((C2057c) w11.m204369e(checkedTextViewArr[i2].getTag())).f9457b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12107j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        boolean zIsEmpty = this.f9447f.isEmpty();
        CheckedTextView checkedTextView = this.f9444c;
        if (zIsEmpty) {
            checkedTextView.setEnabled(false);
            this.f9445d.setEnabled(false);
            return;
        }
        checkedTextView.setEnabled(true);
        this.f9445d.setEnabled(true);
        this.f9452k = new CheckedTextView[this.f9447f.size()][];
        boolean zM12105h = m12105h();
        for (int i = 0; i < this.f9447f.size(); i++) {
            C1861d0.a aVar = this.f9447f.get(i);
            boolean zM12104g = m12104g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f9452k;
            int i2 = aVar.f7406a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            C2057c[] c2057cArr = new C2057c[i2];
            for (int i3 = 0; i3 < aVar.f7406a; i3++) {
                c2057cArr[i3] = new C2057c(aVar, i3);
            }
            Comparator<C2057c> comparator = this.f9454m;
            if (comparator != null) {
                Arrays.sort(c2057cArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.f9443b.inflate(hfc0.f109268a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView2 = (CheckedTextView) this.f9443b.inflate((zM12104g || zM12105h) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView2.setBackgroundResource(this.f9442a);
                checkedTextView2.setText(this.f9451j.mo172102a(c2057cArr[i4].m12108a()));
                checkedTextView2.setTag(c2057cArr[i4]);
                if (aVar.m9854i(i4)) {
                    checkedTextView2.setFocusable(true);
                    checkedTextView2.setOnClickListener(this.f9446e);
                } else {
                    checkedTextView2.setFocusable(false);
                    checkedTextView2.setEnabled(false);
                }
                this.f9452k[i][i4] = checkedTextView2;
                addView(checkedTextView2);
            }
        }
        m12106i();
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f9449h != z) {
            this.f9449h = z;
            m12107j();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f9450i != z) {
            this.f9450i = z;
            if (!z && this.f9448g.size() > 1) {
                Map<dfj0, yfj0> mapM12099b = m12099b(this.f9448g, this.f9447f, false);
                this.f9448g.clear();
                this.f9448g.putAll(mapM12099b);
            }
            m12107j();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f9444c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(pfj0 pfj0Var) {
        this.f9451j = (pfj0) w11.m204369e(pfj0Var);
        m12107j();
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }
}
