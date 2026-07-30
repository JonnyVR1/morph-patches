package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/iiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", "b", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class iiy implements pwl<C8765d.a> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.pwl
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        int iM172391f;
        String strM172388c;
        boolean z;
        boolean z2;
        context.getClass();
        type.getClass();
        detail.getClass();
        Merchandise merchandiseM53601s = detail.m53601s();
        ProductCategory productCategory = merchandiseM53601s.category;
        productCategory.getClass();
        String string = productCategory.toString();
        boolean z3 = true;
        String str = null;
        switch (string.hashCode()) {
            case -2067215576:
                if (!string.equals("superLikeMembership")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar = q1e.INSTANCE;
                    if (!detail.m53553I() || detail.m53551G()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    strM172388c = q1eVar.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case -863315575:
                if (!string.equals(ProductCategory.tttVip)) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar2 = q1e.INSTANCE;
                    if (!detail.m53553I() || detail.m53551G()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String strM172389d = q1eVar2.m172389d(merchandiseM53601s, z);
                    iM172391f = q1eVar2.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                    str = strM172389d;
                    strM172388c = null;
                }
                break;
            case -796840475:
                if (!string.equals("oDiamond")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar3 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar3.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar3.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case -429915974:
                if (!string.equals("unlimitedSwipes")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar4 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar4.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar4.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case -94011970:
                if (!string.equals("svipPicksMembership")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar5 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar5.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar5.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 3542730:
                if (!string.equals("svip")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar6 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar6.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar6.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 165490388:
                if (!string.equals("privateCustom")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar7 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar7.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar7.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 175221999:
                if (!string.equals(ProductCategory.oDiamondPrivateCustom)) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar8 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar8.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar8.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 1166765179:
                if (!string.equals("quickchatMembership")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar9 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z = true;
                    } else {
                        z = true;
                    }
                    String strM172389d2 = q1eVar9.m172389d(merchandiseM53601s, z);
                    iM172391f = q1eVar9.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                    str = strM172389d2;
                    strM172388c = null;
                }
                break;
            case 1366973465:
                if (!string.equals("roaming")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar10 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar10.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar10.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 1848078298:
                if (!string.equals("undoMembership")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar11 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar11.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar11.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 1874772524:
                if (!string.equals("platinum")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar12 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar12.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar12.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            case 1905099240:
                if (!string.equals("picksMembership")) {
                    iM172391f = 0;
                    strM172388c = null;
                } else if (!merchandiseM53601s.autoRenewable()) {
                    iM172391f = 0;
                    strM172388c = null;
                } else {
                    q1e q1eVar13 = q1e.INSTANCE;
                    if (detail.m53553I()) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    strM172388c = q1eVar13.m172388c(merchandiseM53601s, z2);
                    iM172391f = q1eVar13.m172391f(merchandiseM53601s, detail.m53575d(), detail.m53553I());
                }
                break;
            default:
                iM172391f = 0;
                strM172388c = null;
                break;
        }
        detail.m53572b0(str);
        detail.m53570Z(strM172388c);
        detail.m53571a0(iM172391f);
        q1e q1eVar14 = q1e.INSTANCE;
        double dM53575d = detail.m53575d();
        if (!detail.m53553I() && !detail.m53551G()) {
            z3 = false;
        }
        detail.m53569Y(q1eVar14.m172386a(merchandiseM53601s, dM53575d, z3));
    }
}
