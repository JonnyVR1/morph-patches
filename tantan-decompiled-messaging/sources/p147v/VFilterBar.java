package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.Collection;
import p149l.b6c0;
import p149l.eqh0;
import p149l.p4c0;
import p149l.t0c0;
import p149l.t100;
import p149l.u2c0;

/* JADX INFO: loaded from: classes3.dex */
public class VFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: v.VFilterBar$a */
    public interface InterfaceC22537a {
    }

    public VFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m223014b(LinearLayout linearLayout, CharSequence charSequence) {
        linearLayout.setTag(p4c0.f147148w, Boolean.FALSE);
        VText vText = (VText) linearLayout.findViewById(p4c0.f147073J);
        vText.setTypeface(eqh0.m117752c(3), 1);
        vText.setText(charSequence);
        vText.setTextColor(getResources().getColor(t0c0.f167152d));
        ((VIcon) linearLayout.findViewById(p4c0.f147071I)).setImageResource(u2c0.f173354j);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(u2c0.f173433t);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m223015c(LinearLayout linearLayout, View view) {
        for (int i = 0; i < getChildCount(); i++) {
            LinearLayout linearLayout2 = (LinearLayout) getChildAt(i);
            if (linearLayout2 == linearLayout) {
                m223016d(linearLayout2, !((Boolean) linearLayout2.getTag(p4c0.f147148w)).booleanValue());
            } else {
                m223016d(linearLayout2, false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m223016d(LinearLayout linearLayout, boolean z) {
        linearLayout.setTag(p4c0.f147148w, Boolean.valueOf(z));
        VText vText = (VText) linearLayout.findViewById(p4c0.f147073J);
        ((VIcon) linearLayout.findViewById(p4c0.f147071I)).setImageResource(z ? u2c0.f173362k : u2c0.f173354j);
        vText.setTextColor(getResources().getColor(z ? t0c0.f167168t : t0c0.f167152d));
    }

    public void setFilterBarItems(Collection<CharSequence> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        removeAllViews();
        for (CharSequence charSequence : collection) {
            final LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(b6c0.f73784j, (ViewGroup) this, false);
            m223014b(linearLayout, charSequence);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.lok0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129119a.m223015c(linearLayout, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.height = t100.m186890d(56.0f);
            layoutParams.gravity = 17;
            addView(linearLayout, layoutParams);
        }
    }

    public void setOnFilterBarItemClickListener(InterfaceC22537a interfaceC22537a) {
    }

    public VFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFilterBar(Context context) {
        super(context);
    }
}
