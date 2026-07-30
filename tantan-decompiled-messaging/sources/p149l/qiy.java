package p149l;

import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/qiy;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "category", "", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "a", "(Lcom/p1/mobile/putong/core/data/ProductCategory;)Ljava/util/List;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qiy {

    @NotNull
    public static final qiy INSTANCE = new qiy();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<pwl<C8765d.a>> m174923a(@NotNull ProductCategory category) {
        qwl siyVar;
        category.getClass();
        switch (category.toString()) {
            case "superLikeMembership":
            case "tttVip":
                siyVar = new uiy();
                break;
            case "oDiamond":
            case "youthVip":
                siyVar = new tiy();
                break;
            case "unlimitedSwipes":
            case "svipPicksMembership":
                siyVar = new uiy();
                break;
            case "svip":
            case "privateCustom":
            case "oDiamondPrivateCustom":
            case "femaleVip":
                siyVar = new tiy();
                break;
            case "quickchatMembership":
            case "roaming":
            case "undoMembership":
                siyVar = new uiy();
                break;
            case "platinum":
                siyVar = new tiy();
                break;
            case "picksMembership":
                siyVar = new uiy();
                break;
            default:
                siyVar = new siy();
                break;
        }
        return siyVar.mo176827a(category);
    }
}
