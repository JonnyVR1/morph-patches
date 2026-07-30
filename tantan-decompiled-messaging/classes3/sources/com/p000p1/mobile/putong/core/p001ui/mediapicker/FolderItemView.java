package com.p000p1.mobile.putong.core.p001ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import l.iti;
import l.oti;
import l.xdl0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FolderItemView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f501a;

    /* JADX INFO: renamed from: b */
    public VText f502b;

    /* JADX INFO: renamed from: c */
    public VText f503c;

    /* JADX INFO: renamed from: d */
    public ImageView f504d;

    /* JADX INFO: renamed from: e */
    public MediaPickerBaseAct.a f505e;

    /* JADX INFO: renamed from: f */
    public iti f506f;

    public FolderItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m834a(View view) {
        oti.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MediaPickerBaseAct m835b() {
        return getContext();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public void m836c(iti itiVar, boolean z, int i, Media media, MediaPickerBaseAct.a aVar) {
        int i2;
        this.f505e = aVar;
        this.f506f = z ? null : itiVar;
        boolean z2 = m835b().e == m835b().d;
        if (!z) {
            i = itiVar.d > itiVar.c.a.size() ? itiVar.d : itiVar.c.a.size();
        }
        if (z2) {
            i2 = i == 1 ? R.string.Wh : R.string.Vh;
        } else {
            i2 = i == 1 ? R.string.Rh : R.string.Qh;
        }
        this.f503c.setText(m835b().getResources().getString(i2, Integer.valueOf(i)));
        AppCompatTextView appCompatTextView = this.f502b;
        if (z) {
            appCompatTextView.setText(z2 ? R.string.Oh : R.string.Nh);
            boolean zA = NullChecker.a(media);
            SimpleDraweeView simpleDraweeView = this.f501a;
            if (zA) {
                simpleDraweeView.setVisibility(0);
                MediaItemView.m838e(media, this.f501a);
            } else {
                simpleDraweeView.setVisibility(4);
            }
            xdl0.M0(this.f504d, m835b().e.c == null);
            return;
        }
        appCompatTextView.setText(itiVar.a);
        int size = itiVar.c.a.size();
        SimpleDraweeView simpleDraweeView2 = this.f501a;
        if (size > 0) {
            simpleDraweeView2.setVisibility(0);
            MediaItemView.m838e((Media) itiVar.c.a.get(0), this.f501a);
        } else {
            simpleDraweeView2.setVisibility(4);
        }
        xdl0.M0(this.f504d, itiVar.equals(m835b().e.c));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f505e.b(this.f506f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m834a(this);
        setOnClickListener(this);
    }

    public FolderItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
