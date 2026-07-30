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

/* JADX INFO: loaded from: classes4.dex */
public class gzj0<D extends ho2> implements s7m<jzj0<D>> {

    /* JADX INFO: renamed from: a */
    public jzj0<D> f105150a;

    /* JADX INFO: renamed from: b */
    public VText f105151b;

    /* JADX INFO: renamed from: c */
    public int f105152c = -1;

    public gzj0(VText vText) {
        this.f105151b = vText;
    }

    /* JADX INFO: renamed from: d */
    private boolean m128869d() {
        return this.f105150a.m206027E2().mo149813j().isVoiceLive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m128870e(View view) {
        if (m128869d() && ypv.f199497e.getString(R$string.f47368ld).equals(this.f105151b.getText().toString())) {
            this.f105150a.m143935p4();
        } else {
            this.f105150a.m143934o4();
        }
        this.f105150a.mo162152Y3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f105151b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jzj0<D> jzj0Var) {
        this.f105150a = jzj0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m128872c() {
        xdl0.m208329E0(this.f105151b, new View.OnClickListener() { // from class: l.fzj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99974a.m128870e(view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00ea  */
    /* JADX INFO: renamed from: f */
    public void m128873f(User user, int i) {
        float f;
        int i2;
        if (user == null) {
            return;
        }
        if (i != -1) {
            this.f105152c = i;
        }
        int color = m128869d() ? Color.parseColor("#fe7e1d") : Color.parseColor("#ffffff");
        if (user.matchedOrFollowed()) {
            color = Color.parseColor(m128869d() ? "#60000000" : "#40ffffff");
        }
        if (!m128869d()) {
            this.f105151b.setBackground(kvc0.m147353b(user.matchedOrFollowed() ? i3c0.f110963c1 : i3c0.f110662C0));
        }
        Relationship relationship = user.localRelationship;
        if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
            Followship followship = user.localFollowship;
            if (followship == null || !TEnum.equals(followship.state, "matched")) {
                Followship followship2 = user.localFollowship;
                f = 16.0f;
                if (followship2 == null || !TEnum.equals(followship2.state, FollowshipStatus.following)) {
                    int i3 = R$string.f47442p;
                    this.f105151b.append(user.isFemale() ? ypv.f199497e.getString(R$string.f46592Bd) : ypv.f199497e.getString(R$string.f46993U5));
                    i2 = i3;
                } else {
                    i2 = R$string.f47420o;
                    this.f105151b.setText(i2);
                }
            } else if (m128869d()) {
                i2 = R$string.f47368ld;
                color = Color.parseColor("#fe7e1d");
            } else {
                i2 = R$string.f46781K4;
            }
            if (this.f105152c < 3 && (i2 == R$string.f46963Sh || i2 == R$string.f47420o || i2 == R$string.f46781K4)) {
                xdl0.m208344M(this.f105151b, false);
                return;
            }
            xdl0.m208344M(this.f105151b, true);
            this.f105151b.setTextColor(color);
            this.f105151b.setTextSize(m128869d() ? 15.0f : f);
            this.f105151b.setText(i2);
        }
        if (m128869d()) {
            i2 = R$string.f47368ld;
            color = Color.parseColor("#fe7e1d");
        } else {
            i2 = R$string.f46963Sh;
        }
        f = 15.0f;
        if (this.f105152c < 3) {
        }
        xdl0.m208344M(this.f105151b, true);
        this.f105151b.setTextColor(color);
        this.f105151b.setTextSize(m128869d() ? 15.0f : f);
        this.f105151b.setText(i2);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
