package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Collection;
import l.b6c0;
import l.p4c0;
import l.t0c0;
import l.t100;
import l.u2c0;
import p003l.eqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: v.VFilterBar$a */
    public interface InterfaceC1330a {
    }

    public VFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m11491b(LinearLayout linearLayout, CharSequence charSequence) {
        linearLayout.setTag(p4c0.w, Boolean.FALSE);
        AppCompatTextView appCompatTextView = (VText) linearLayout.findViewById(p4c0.J);
        appCompatTextView.setTypeface(eqh0.m3924c(3), 1);
        appCompatTextView.setText(charSequence);
        appCompatTextView.setTextColor(getResources().getColor(t0c0.d));
        ((VIcon) linearLayout.findViewById(p4c0.I)).setImageResource(u2c0.j);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(u2c0.t);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m11492c(LinearLayout linearLayout, View view) {
        for (int i = 0; i < getChildCount(); i++) {
            LinearLayout linearLayout2 = (LinearLayout) getChildAt(i);
            if (linearLayout2 == linearLayout) {
                m11493d(linearLayout2, !((Boolean) linearLayout2.getTag(p4c0.w)).booleanValue());
            } else {
                m11493d(linearLayout2, false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11493d(LinearLayout linearLayout, boolean z) {
        linearLayout.setTag(p4c0.w, Boolean.valueOf(z));
        AppCompatTextView appCompatTextView = (VText) linearLayout.findViewById(p4c0.J);
        ((VIcon) linearLayout.findViewById(p4c0.I)).setImageResource(z ? u2c0.k : u2c0.j);
        appCompatTextView.setTextColor(getResources().getColor(z ? t0c0.t : t0c0.d));
    }

    public void setFilterBarItems(Collection<CharSequence> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        removeAllViews();
        for (CharSequence charSequence : collection) {
            final LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(b6c0.j, (ViewGroup) this, false);
            m11491b(linearLayout, charSequence);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.lok0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5376a.m11492c(linearLayout, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.height = t100.d(56.0f);
            layoutParams.gravity = 17;
            addView(linearLayout, layoutParams);
        }
    }

    public void setOnFilterBarItemClickListener(InterfaceC1330a interfaceC1330a) {
    }

    public VFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFilterBar(Context context) {
        super(context);
    }
}
