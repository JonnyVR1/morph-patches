package p147v;

import android.content.Context;
import android.util.AttributeSet;
import com.rengwuxian.materialedittext.MaterialEditText;
import p133rx.C22306c;
import p149l.dqh0;
import p149l.eqh0;
import p149l.t0c0;

/* JADX INFO: loaded from: classes3.dex */
public class VMaterialEdit extends MaterialEditText {
    public VMaterialEdit(Context context) {
        super(context);
        m223126G(context, null, 0);
    }

    /* JADX INFO: renamed from: G */
    public final void m223126G(Context context, AttributeSet attributeSet, int i) {
        eqh0.m117750a(this, context, attributeSet, i);
        setFloatingLabel(2);
        setPrimaryColor(context.getResources().getColor(t0c0.f167146D));
    }

    /* JADX INFO: renamed from: H */
    public C22306c<CharSequence> m223127H() {
        return dqh0.m113070c(this, true);
    }

    /* JADX INFO: renamed from: I */
    public C22306c<CharSequence> m223128I(boolean z) {
        return dqh0.m113070c(this, z);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        eqh0.m117751b(this, context, i);
    }

    public VMaterialEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223126G(context, attributeSet, 0);
    }

    public VMaterialEdit(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223126G(context, attributeSet, i);
    }
}
