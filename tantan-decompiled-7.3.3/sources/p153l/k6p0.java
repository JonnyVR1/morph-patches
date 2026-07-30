package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes10.dex */
public class k6p0<D extends oo2> implements iam<m6p0<D>> {

    /* JADX INFO: renamed from: a */
    public m6p0<D> f124195a;

    /* JADX INFO: renamed from: b */
    public VText f124196b;

    /* JADX INFO: renamed from: c */
    public int f124197c = -1;

    public k6p0(VText vText) {
        this.f124196b = vText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m148535d(View view) {
        boolean zEquals = zrv.f205803e.getString(R$string.f48216ld).equals(this.f124196b.getText().toString());
        m6p0<D> m6p0Var = this.f124195a;
        if (zEquals) {
            m6p0Var.m157259p4();
        } else {
            m6p0Var.m157258o4();
        }
        this.f124195a.m100211Z3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f124196b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(m6p0<D> m6p0Var) {
        this.f124195a = m6p0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m148537c() {
        bnl0.m105509E0(this.f124196b, new View.OnClickListener() { // from class: l.j6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118589a.m148535d(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m148538e(User user, int i) {
        int i2;
        int i3;
        if (user == null) {
            return;
        }
        if (i != -1) {
            this.f124197c = i;
        }
        Relationship relationship = user.localRelationship;
        String str = "#ffffff";
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (followship == null || !TEnum.equals(followship.state, "matched")) {
                Followship followship2 = user.localFollowship;
                if (followship2 == null || !TEnum.equals(followship2.state, FollowshipStatus.following)) {
                    i2 = R$string.f48290p;
                    i3 = obc0.f145990C0;
                } else {
                    i2 = R$string.f48268o;
                    i3 = obc0.f146291c1;
                    str = "#33ffffff";
                }
            } else {
                i2 = R$string.f48216ld;
                i3 = obc0.f146291c1;
            }
        } else {
            i2 = R$string.f48216ld;
            i3 = obc0.f146291c1;
        }
        this.f124196b.setBackground(n3d0.m161278b(i3));
        int i4 = this.f124197c;
        VText vText = this.f124196b;
        if (i4 > 3) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        this.f124196b.setTextColor(Color.parseColor(str));
        this.f124196b.setText(i2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
