package p002l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.kvc0;
import l.s7m;
import l.xdl0;
import l.ypv;
import p002l.ho2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gzj0<D extends ho2> implements s7m<jzj0<D>> {

    /* JADX INFO: renamed from: a */
    public jzj0<D> f11704a;

    /* JADX INFO: renamed from: b */
    public VText f11705b;

    /* JADX INFO: renamed from: c */
    public int f11706c = -1;

    public gzj0(VText vText) {
        this.f11705b = vText;
    }

    /* JADX INFO: renamed from: d */
    private boolean m14115d() {
        return this.f11704a.m25547E2().m17234j().isVoiceLive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m14116e(View view) {
        if (m14115d() && ypv.e.getString(R$string.f3410ld).equals(this.f11705b.getText().toString())) {
            this.f11704a.m16460p4();
        } else {
            this.f11704a.m16459o4();
        }
        this.f11704a.mo19187Y3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14117C0() {
        return this.f11705b.getContext();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m14121i1(jzj0<D> jzj0Var) {
        this.f11704a = jzj0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m14119c() {
        xdl0.E0(this.f11705b, new View.OnClickListener() { // from class: l.fzj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10697a.m14116e(view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX INFO: renamed from: f */
    public void m14120f(User user, int i) {
        float f;
        int i2;
        if (user == null) {
            return;
        }
        if (i != -1) {
            this.f11706c = i;
        }
        int color = m14115d() ? Color.parseColor("#fe7e1d") : Color.parseColor("#ffffff");
        if (user.matchedOrFollowed()) {
            color = Color.parseColor(m14115d() ? "#60000000" : "#40ffffff");
        }
        if (!m14115d()) {
            this.f11705b.setBackground(kvc0.b(user.matchedOrFollowed() ? i3c0.f12748c1 : i3c0.f12447C0));
        }
        Relationship relationship = user.localRelationship;
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (followship == null || !TEnum.equals(followship.state, "matched")) {
                Followship followship2 = user.localFollowship;
                f = 16.0f;
                if (followship2 == null || !TEnum.equals(followship2.state, "following")) {
                    int i3 = R$string.f3484p;
                    this.f11705b.append(user.isFemale() ? ypv.e.getString(R$string.f2634Bd) : ypv.e.getString(R$string.f3035U5));
                    i2 = i3;
                } else {
                    i2 = R$string.f3462o;
                    this.f11705b.setText(i2);
                }
            } else if (m14115d()) {
                i2 = R$string.f3410ld;
                color = Color.parseColor("#fe7e1d");
            } else {
                i2 = R$string.f2823K4;
            }
            if (this.f11706c < 3 && (i2 == R$string.f3005Sh || i2 == R$string.f3462o || i2 == R$string.f2823K4)) {
                xdl0.M(this.f11705b, false);
                return;
            }
            xdl0.M(this.f11705b, true);
            this.f11705b.setTextColor(color);
            this.f11705b.setTextSize(m14115d() ? 15.0f : f);
            this.f11705b.setText(i2);
        }
        if (m14115d()) {
            i2 = R$string.f3410ld;
            color = Color.parseColor("#fe7e1d");
        } else {
            i2 = R$string.f3005Sh;
        }
        f = 15.0f;
        if (this.f11706c < 3) {
        }
        xdl0.M(this.f11705b, true);
        this.f11705b.setTextColor(color);
        this.f11705b.setTextSize(m14115d() ? 15.0f : f);
        this.f11705b.setText(i2);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
