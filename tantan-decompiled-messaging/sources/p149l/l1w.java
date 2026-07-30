package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/l1w;", "", "<init>", "()V", "", "msgId", "", "templateId", "Ll/und;", "defaultHandlerParam", "", "b", "(Ljava/lang/String;ILl/und;)V", "param", "a", "(Ll/und;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class l1w {

    @NotNull
    public static final l1w INSTANCE = new l1w();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m148203b(@NotNull String msgId, int templateId, @Nullable und defaultHandlerParam) {
        msgId.getClass();
        StringBuilder sb = new StringBuilder(" content  msgId = ");
        sb.append(msgId);
        sb.append(" templateId = ");
        sb.append(templateId);
        if (defaultHandlerParam != null) {
            sb.append(" currentTemplateIdList = ");
            sb.append(INSTANCE.m148204a(defaultHandlerParam));
        }
        gkh0.m126627j("[live][chat]message_render_error", sb.toString());
        CrashHelper.m81297d(new Exception("[live][chat]message_render_error".concat(" content  msgId = " + msgId + " templateId = " + templateId)), 20);
    }

    /* JADX INFO: renamed from: a */
    public final String m148204a(und param) {
        int[] intArray;
        HashMap<Integer, BLiveTemplate> mapM171774g;
        pwz pwzVarM194417d = param.m194417d();
        if (pwzVarM194417d == null || (mapM171774g = pwzVarM194417d.m171774g()) == null) {
            intArray = null;
        } else {
            ArrayList arrayList = new ArrayList(mapM171774g.size());
            Iterator<Map.Entry<Integer, BLiveTemplate>> it = mapM171774g.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getKey());
            }
            intArray = CollectionsKt.toIntArray(arrayList);
        }
        String string = Arrays.toString(intArray);
        string.getClass();
        return string;
    }
}
