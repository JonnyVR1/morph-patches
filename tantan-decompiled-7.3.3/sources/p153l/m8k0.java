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

/* JADX INFO: loaded from: classes4.dex */
public class m8k0<D extends oo2> implements iam<p8k0<D>> {

    /* JADX INFO: renamed from: a */
    public p8k0<D> f135260a;

    /* JADX INFO: renamed from: b */
    public VText f135261b;

    /* JADX INFO: renamed from: c */
    public int f135262c = -1;

    public m8k0(VText vText) {
        this.f135261b = vText;
    }

    /* JADX INFO: renamed from: d */
    private boolean m157493d() {
        return this.f135260a.m213810E2().mo183435j().isVoiceLive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m157494e(View view) {
        if (m157493d() && zrv.f205803e.getString(R$string.f48216ld).equals(this.f135261b.getText().toString())) {
            this.f135260a.m171255p4();
        } else {
            this.f135260a.m171254o4();
        }
        this.f135260a.mo159725Y3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f135261b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p8k0<D> p8k0Var) {
        this.f135260a = p8k0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m157496c() {
        bnl0.m105509E0(this.f135261b, new View.OnClickListener() { // from class: l.l8k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130467a.m157494e(view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX INFO: renamed from: f */
    public void m157497f(User user, int i) {
        float f;
        int i2;
        if (user == null) {
            return;
        }
        if (i != -1) {
            this.f135262c = i;
        }
        int color = m157493d() ? Color.parseColor("#fe7e1d") : Color.parseColor("#ffffff");
        if (user.matchedOrFollowed()) {
            color = Color.parseColor(m157493d() ? "#60000000" : "#40ffffff");
        }
        if (!m157493d()) {
            this.f135261b.setBackground(n3d0.m161278b(user.matchedOrFollowed() ? obc0.f146291c1 : obc0.f145990C0));
        }
        Relationship relationship = user.localRelationship;
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (followship == null || !TEnum.equals(followship.state, "matched")) {
                Followship followship2 = user.localFollowship;
                f = 16.0f;
                if (followship2 == null || !TEnum.equals(followship2.state, FollowshipStatus.following)) {
                    int i3 = R$string.f48290p;
                    this.f135261b.append(user.isFemale() ? zrv.f205803e.getString(R$string.f47440Bd) : zrv.f205803e.getString(R$string.f47841U5));
                    i2 = i3;
                } else {
                    i2 = R$string.f48268o;
                    this.f135261b.setText(i2);
                }
            } else if (m157493d()) {
                i2 = R$string.f48216ld;
                color = Color.parseColor("#fe7e1d");
            } else {
                i2 = R$string.f47629K4;
            }
            if (this.f135262c < 3 && (i2 == R$string.f47811Sh || i2 == R$string.f48268o || i2 == R$string.f47629K4)) {
                bnl0.m105524M(this.f135261b, false);
                return;
            }
            bnl0.m105524M(this.f135261b, true);
            this.f135261b.setTextColor(color);
            this.f135261b.setTextSize(m157493d() ? 15.0f : f);
            this.f135261b.setText(i2);
        }
        if (m157493d()) {
            i2 = R$string.f48216ld;
            color = Color.parseColor("#fe7e1d");
        } else {
            i2 = R$string.f47811Sh;
        }
        f = 15.0f;
        if (this.f135262c < 3) {
        }
        bnl0.m105524M(this.f135261b, true);
        this.f135261b.setTextColor(color);
        this.f135261b.setTextSize(m157493d() ? 15.0f : f);
        this.f135261b.setText(i2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
