package p007l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c16;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sf4 extends jq2<cg4> {

    /* JADX INFO: renamed from: a */
    public ArrayList<Media> f12901a;

    /* JADX INFO: renamed from: b */
    public List<k90> f12902b;

    /* JADX INFO: renamed from: c */
    public MessageLocation f12903c;

    /* JADX INFO: renamed from: d */
    public boolean f12904d;

    /* JADX INFO: renamed from: e */
    public p90 f12905e;

    /* JADX INFO: renamed from: l.sf4$a */
    public class C2483a implements eml.InterfaceC2379a {
        public C2483a() {
        }

        @Override // p007l.eml.InterfaceC2379a
        /* JADX INFO: renamed from: a */
        public void mo9933a(List<k90> list) {
            sf4.this.f12902b.clear();
            if (!vwb.J(list)) {
                sf4.this.f12902b.addAll(list);
            }
            ((cg4) ((jq2) sf4.this).viewModel).m9157Q();
        }

        @Override // p007l.eml.InterfaceC2379a
        public void onError(Throwable th) {
            ((cg4) ((jq2) sf4.this).viewModel).m9147G();
        }
    }

    public sf4(mcr mcrVar) {
        super(mcrVar);
        this.f12901a = new ArrayList<>();
        this.f12902b = vwb.f0(new k90[]{new k90()});
        this.f12904d = false;
        this.f12905e = new p90(new C2483a());
    }

    /* JADX INFO: renamed from: m0 */
    private void m14130m0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (NullChecker.a(stringExtra)) {
            ((cg4) ((jq2) this).viewModel).m9151K(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m14131q0(Bundle bundle) {
        Intent intent = act().getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if ("android.intent.action.SEND".equals(action) && NullChecker.a(type)) {
            if ("text/plain".equals(type)) {
                this.f12904d = true;
                m14130m0(intent);
            } else if (type.startsWith("image/")) {
                this.f12904d = true;
                m14136k0(intent);
            }
        } else if ("android.intent.action.SEND_MULTIPLE".equals(action) && NullChecker.a(type)) {
            if (type.startsWith("image/")) {
                this.f12904d = true;
                m14137l0(intent);
            }
        } else if (!"action_send_with_media".equals(action) || !NullChecker.a(type)) {
            this.f12901a = (ArrayList) act().getIntent().getSerializableExtra("images");
        } else if (type.startsWith("image/")) {
            this.f12904d = true;
            this.f12901a = (ArrayList) act().getIntent().getSerializableExtra("images");
        }
        if (vwb.J(this.f12901a)) {
            this.f12901a = new ArrayList<>();
        }
        ((cg4) ((jq2) this).viewModel).m9167w(bundle);
    }

    /* JADX INFO: renamed from: a0 */
    public void m14132a0() {
        super.a0();
        creates(new e30() { // from class: l.rf4
            public final void call(Object obj) {
                this.f12634a.m14131q0((Bundle) obj);
            }
        });
    }

    @NonNull
    public Act act() {
        return ((cg4) ((jq2) this).viewModel).act();
    }

    public void destroy() {
        if (NullChecker.a(this.f12905e)) {
            this.f12905e.destroy();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public List<k90> m14133h0() {
        return this.f12902b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m14134i0() {
        this.f12903c = null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m14135j0(Location location) {
        this.f12905e.mo9600a(location, act());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m14136k0(Intent intent) {
        m14130m0(intent);
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (NullChecker.a(uri)) {
            String strC = rhi.C(c16.g(uri));
            if (NullChecker.a(strC)) {
                Picture picture = new Picture();
                picture.url = strC;
                picture.status = MediaLocalStatus.get(MediaLocalStatus.raw);
                this.f12901a.add(picture);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m14137l0(Intent intent) {
        m14130m0(intent);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (NullChecker.a(parcelableArrayListExtra)) {
            int size = parcelableArrayListExtra.size() <= 9 ? parcelableArrayListExtra.size() : 9;
            for (int i = 0; i < size; i++) {
                String strC = rhi.C(c16.g((Uri) parcelableArrayListExtra.get(i)));
                if (NullChecker.a(strC)) {
                    Picture picture = new Picture();
                    picture.url = strC;
                    picture.status = MediaLocalStatus.get(MediaLocalStatus.raw);
                    this.f12901a.add(picture);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m14138n0() {
        this.f12905e.init();
    }

    /* JADX INFO: renamed from: o0 */
    public void m14139o0(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("sharedText");
        if (!TextUtils.isEmpty(string)) {
            ((cg4) ((jq2) this).viewModel).m9156P(string);
        }
        ArrayList<Media> arrayList = (ArrayList) bundle.getSerializable("images");
        if (!vwb.J(arrayList)) {
            this.f12901a = arrayList;
        }
        MessageLocation messageLocation = (MessageLocation) bundle.getSerializable("location");
        if (NullChecker.a(messageLocation)) {
            this.f12903c = messageLocation;
            ((cg4) ((jq2) this).viewModel).m9152L(messageLocation);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m14140p0() {
        return vwb.J(this.f12901a);
    }

    /* JADX INFO: renamed from: r0 */
    public void m14141r0(int i, int i2, Intent intent) {
        if (i == 1) {
            qib0.E.t();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m14142s0(List<Media> list) {
        if (!NullChecker.b(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.z(list.get(0).url)).b <= 15000) {
            ((cg4) ((jq2) this).viewModel).m9153M(list);
        } else {
            lsi0.h(R$string.f648z3);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m14143t0() {
        if (!((cg4) ((jq2) this).viewModel).m9163q() || act().isFinishing()) {
            return true;
        }
        Moment momentNew_ = Moment.new_();
        momentNew_.media = this.f12901a;
        momentNew_.value = ((cg4) ((jq2) this).viewModel).m9162p();
        momentNew_.location = this.f12903c;
        if (this.f12904d) {
            FeedModule.f315c.m1659j4(momentNew_);
        } else {
            Intent intent = new Intent();
            intent.putExtra("moment", momentNew_);
            act().setResult(-1, intent);
        }
        act().finish();
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public void m14144u0(k90 k90Var) {
        MessageLocation messageLocation = new MessageLocation();
        this.f12903c = messageLocation;
        messageLocation.name = k90Var.m11398c();
        this.f12903c.address = k90Var.m11396a();
        this.f12903c.coordinates = k90Var.m11397b();
        ((cg4) ((jq2) this).viewModel).m9154N(this.f12903c.name);
    }

    /* JADX INFO: renamed from: x0 */
    public void m14145x0(Bundle bundle) {
        String strM9164s = ((cg4) ((jq2) this).viewModel).m9164s();
        if (!TextUtils.isEmpty(strM9164s)) {
            bundle.putString("sharedText", strM9164s);
        }
        if (!vwb.J(this.f12901a)) {
            bundle.putSerializable("images", this.f12901a);
        }
        if (NullChecker.a(this.f12903c)) {
            bundle.putSerializable("location", this.f12903c);
        }
    }
}
