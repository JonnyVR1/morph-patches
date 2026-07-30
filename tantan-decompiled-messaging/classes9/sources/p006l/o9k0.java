package p006l;

import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import l.cb;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class o9k0 extends cb {
    public o9k0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Picture m20431q0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ Media m20433s0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m20435u0(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m20436x0(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public void m20437A0(final Picture picture) {
        if (TEnum.equals(((Media) picture).status, "raw")) {
            new lsx(vwb.f0(new Media[]{picture}), false).flatMap(new w9j() { // from class: l.h9k0
                public final Object call(Object obj) {
                    return ya5.m28127I(vwb.f0(new Media[]{picture}), "profile").map(new w9j() { // from class: l.n9k0
                        public final Object call(Object obj2) {
                            return o9k0.m20431q0((List) obj2);
                        }
                    });
                }
            }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.i9k0
                public final void call(Object obj) {
                    this.f14326a.m20438y0((Picture) obj);
                }
            }, new e30() { // from class: l.j9k0
                public final void call(Object obj) {
                    o9k0.m20436x0((Throwable) obj);
                }
            }));
        } else {
            ya5.m28127I(vwb.f0(new Media[]{picture}), "profile").map(new w9j() { // from class: l.k9k0
                public final Object call(Object obj) {
                    return o9k0.m20433s0((List) obj);
                }
            }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.l9k0
                public final void call(Object obj) {
                    this.f16292a.m20439z0((Media) obj);
                }
            }, new e30() { // from class: l.m9k0
                public final void call(Object obj) {
                    o9k0.m20435u0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m20438y0(Picture picture) {
        ((jq2) this).viewModel.I("javascript:adtp('" + ((Media) picture).url + "')");
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m20439z0(Media media) {
        ((jq2) this).viewModel.I("javascript:adtp('" + media.url + "')");
    }
}
