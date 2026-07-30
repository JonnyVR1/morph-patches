package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class gxo0<D extends ho2> implements s7m<ixo0<D>> {

    /* JADX INFO: renamed from: a */
    public ixo0<D> f104910a;

    /* JADX INFO: renamed from: b */
    public VText f104911b;

    /* JADX INFO: renamed from: c */
    public int f104912c = -1;

    public gxo0(VText vText) {
        this.f104911b = vText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m128634d(View view) {
        boolean zEquals = ypv.f199497e.getString(R$string.f47368ld).equals(this.f104911b.getText().toString());
        ixo0<D> ixo0Var = this.f104910a;
        if (zEquals) {
            ixo0Var.m138882p4();
        } else {
            ixo0Var.m138881o4();
        }
        this.f104910a.m203470Z3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f104911b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ixo0<D> ixo0Var) {
        this.f104910a = ixo0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m128636c() {
        xdl0.m208329E0(this.f104911b, new View.OnClickListener() { // from class: l.fxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99780a.m128634d(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m128637e(User user, int i) {
        int i2;
        int i3;
        if (user == null) {
            return;
        }
        if (i != -1) {
            this.f104912c = i;
        }
        Relationship relationship = user.localRelationship;
        String str = "#ffffff";
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (followship == null || !TEnum.equals(followship.state, "matched")) {
                Followship followship2 = user.localFollowship;
                if (followship2 == null || !TEnum.equals(followship2.state, FollowshipStatus.following)) {
                    i2 = R$string.f47442p;
                    i3 = i3c0.f110662C0;
                } else {
                    i2 = R$string.f47420o;
                    i3 = i3c0.f110963c1;
                    str = "#33ffffff";
                }
            } else {
                i2 = R$string.f47368ld;
                i3 = i3c0.f110963c1;
            }
        } else {
            i2 = R$string.f47368ld;
            i3 = i3c0.f110963c1;
        }
        this.f104911b.setBackground(kvc0.m147353b(i3));
        int i4 = this.f104912c;
        VText vText = this.f104911b;
        if (i4 > 3) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        this.f104911b.setTextColor(Color.parseColor(str));
        this.f104911b.setText(i2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
