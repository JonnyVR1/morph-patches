package p009l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.livingroom.R;
import l.ho2;
import l.i3c0;
import l.kvc0;
import l.s7m;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gxo0<D extends ho2> implements s7m<ixo0<D>> {

    /* JADX INFO: renamed from: a */
    public ixo0<D> f13804a;

    /* JADX INFO: renamed from: b */
    public VText f13805b;

    /* JADX INFO: renamed from: c */
    public int f13806c = -1;

    public gxo0(VText vText) {
        this.f13805b = vText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m15360d(View view) {
        boolean zEquals = ypv.f23200e.getString(R.string.ld).equals(this.f13805b.getText().toString());
        ixo0<D> ixo0Var = this.f13804a;
        if (zEquals) {
            ixo0Var.m16788p4();
        } else {
            ixo0Var.m16787o4();
        }
        this.f13804a.m24297Z3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15361C0() {
        return this.f13805b.getContext();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m15365i1(ixo0<D> ixo0Var) {
        this.f13804a = ixo0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m15363c() {
        xdl0.E0(this.f13805b, new View.OnClickListener() { // from class: l.fxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13191a.m15360d(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m15364e(User user, int i) {
        int i2;
        int i3;
        if (user == null) {
            return;
        }
        if (i != -1) {
            this.f13806c = i;
        }
        Relationship relationship = user.localRelationship;
        String str = "#ffffff";
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (followship == null || !TEnum.equals(followship.state, "matched")) {
                Followship followship2 = user.localFollowship;
                if (followship2 == null || !TEnum.equals(followship2.state, "following")) {
                    i2 = R.string.p;
                    i3 = i3c0.C0;
                } else {
                    i2 = R.string.o;
                    i3 = i3c0.c1;
                    str = "#33ffffff";
                }
            } else {
                i2 = R.string.ld;
                i3 = i3c0.c1;
            }
        } else {
            i2 = R.string.ld;
            i3 = i3c0.c1;
        }
        this.f13805b.setBackground(kvc0.b(i3));
        int i4 = this.f13806c;
        VText vText = this.f13805b;
        if (i4 > 3) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        this.f13805b.setTextColor(Color.parseColor(str));
        this.f13805b.setText(i2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
