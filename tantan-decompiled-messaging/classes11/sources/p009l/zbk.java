package p009l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p1.mobile.putong.core.data.GroupAttribute;
import com.p1.mobile.putong.core.data.GroupCategory;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.c3c0;
import l.l6c0;
import l.s7m;
import l.xdl0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zbk implements s7m<wbk> {

    /* JADX INFO: renamed from: a */
    public VText f23546a;

    /* JADX INFO: renamed from: b */
    public VLinear f23547b;

    /* JADX INFO: renamed from: c */
    public VImage f23548c;

    /* JADX INFO: renamed from: d */
    public final GroupCreateCategoryAct f23549d;

    /* JADX INFO: renamed from: e */
    public wbk f23550e;

    /* JADX INFO: renamed from: l.zbk$a */
    public static class C1348a {
        /* JADX INFO: renamed from: b */
        public static void m25646b(zbk zbkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            zbkVar.f23546a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            zbkVar.f23547b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            zbkVar.f23548c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m25647c(zbk zbkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.h0, viewGroup, false);
            m25646b(zbkVar, viewInflate);
            return viewInflate;
        }
    }

    public zbk(GroupCreateCategoryAct groupCreateCategoryAct) {
        this.f23549d = groupCreateCategoryAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m25637j(View view) {
        this.f23549d.finish();
    }

    /* JADX INFO: renamed from: k */
    private void m25638k(@NonNull List<GroupAttribute> list) {
        GroupAttribute groupAttribute = list.get(0);
        this.f23546a.setText(groupAttribute.creationLimit.value);
        this.f23547b.removeAllViews();
        Iterator it = groupAttribute.categories.iterator();
        while (it.hasNext()) {
            m25641f((GroupCategory) it.next());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25639C0() {
        return this.f23549d;
    }

    /* JADX INFO: renamed from: e */
    public View m25640e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1348a.m25647c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final void m25641f(GroupCategory groupCategory) {
        LinearLayout linearLayout = new LinearLayout(this.f23549d);
        linearLayout.setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        try {
            gradientDrawable.setColor(Color.parseColor(groupCategory.backgroundColor));
        } catch (Exception unused) {
            gradientDrawable.setColor(-526345);
        }
        gradientDrawable.setCornerRadius(xdl0.w(10.0f));
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(this.f23549d);
        textView.setText(groupCategory.name);
        textView.setTextSize(16.0f);
        try {
            textView.setTextColor(Color.parseColor(groupCategory.textColor));
        } catch (Exception unused2) {
            textView.setTextColor(-14540254);
        }
        textView.setGravity(16);
        textView.setPadding(xdl0.w(16.0f), 0, 0, 0);
        linearLayout.setTag(groupCategory);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -1, 1.0f));
        ImageView imageView = new ImageView(this.f23549d);
        imageView.setPadding(xdl0.w(10.0f), 0, xdl0.w(10.0f), 0);
        imageView.setImageResource(c3c0.s0);
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(xdl0.w(32.0f), xdl0.w(12.0f)));
        linearLayout.setGravity(16);
        final wbk wbkVar = this.f23550e;
        Objects.requireNonNull(wbkVar);
        xdl0.E0(linearLayout, new View.OnClickListener() { // from class: l.ybk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wbkVar.m24049f0(view);
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, xdl0.w(48.0f));
        layoutParams.bottomMargin = xdl0.w(12.0f);
        this.f23547b.addView(linearLayout, layoutParams);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m25643i1(wbk wbkVar) {
        this.f23550e = wbkVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25640e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m25644r() {
        if (NullChecker.a(this.f23549d.getSupportActionBar())) {
            this.f23549d.getSupportActionBar().m();
        }
        xdl0.E0(this.f23548c, new View.OnClickListener() { // from class: l.xbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22499a.m25637j(view);
            }
        });
        m25638k(this.f23550e.m24050g0());
    }

    public void destroy() {
    }
}
