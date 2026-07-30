package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.Collection;
import p153l.abc0;
import p153l.gec0;
import p153l.lyh0;
import p153l.qa00;
import p153l.vcc0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: v.VFilterBar$a */
    public interface InterfaceC22652a {
    }

    public VFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }

    /* JADX INFO: renamed from: b */
    public final void m224260b(LinearLayout linearLayout, CharSequence charSequence) {
        linearLayout.setTag(vcc0.f183448w, Boolean.FALSE);
        VText vText = (VText) linearLayout.findViewById(vcc0.f183373J);
        vText.setTypeface(lyh0.m156283c(3), 1);
        vText.setText(charSequence);
        vText.setTextColor(getResources().getColor(z8c0.f203343d));
        ((VIcon) linearLayout.findViewById(vcc0.f183371I)).setImageResource(abc0.f69474j);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(abc0.f69553t);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m224261c(LinearLayout linearLayout, View view) {
        for (int i = 0; i < getChildCount(); i++) {
            LinearLayout linearLayout2 = (LinearLayout) getChildAt(i);
            if (linearLayout2 == linearLayout) {
                m224262d(linearLayout2, !((Boolean) linearLayout2.getTag(vcc0.f183448w)).booleanValue());
            } else {
                m224262d(linearLayout2, false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m224262d(LinearLayout linearLayout, boolean z) {
        linearLayout.setTag(vcc0.f183448w, Boolean.valueOf(z));
        VText vText = (VText) linearLayout.findViewById(vcc0.f183373J);
        ((VIcon) linearLayout.findViewById(vcc0.f183371I)).setImageResource(z ? abc0.f69482k : abc0.f69474j);
        vText.setTextColor(getResources().getColor(z ? z8c0.f203359t : z8c0.f203343d));
    }

    public void setFilterBarItems(Collection<CharSequence> collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        removeAllViews();
        for (CharSequence charSequence : collection) {
            final LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(gec0.f103797j, (ViewGroup) this, false);
            m224260b(linearLayout, charSequence);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.rxk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165357a.m224261c(linearLayout, view);
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.height = qa00.m175859d(56.0f);
            layoutParams.gravity = 17;
            addView(linearLayout, layoutParams);
        }
    }

    public void setOnFilterBarItemClickListener(InterfaceC22652a interfaceC22652a) {
    }

    public VFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFilterBar(Context context) {
        super(context);
    }
}
