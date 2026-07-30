package com.hellogroup.p036mk.business.util;

import com.hellogroup.fep.base.FepContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;
import p153l.x4d0;
import p153l.xh3;
import p153l.y35;
import p153l.zgi;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/hellogroup/mk/business/util/OfflinePkgCheckUtil;", "", "<init>", "()V", "Ll/y35;", "checkInfo", "Ll/x4d0;", "resourceResponse", "", "a", "(Ll/y35;Ll/x4d0;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class OfflinePkgCheckUtil {
    public static final OfflinePkgCheckUtil INSTANCE = new OfflinePkgCheckUtil();

    private OfflinePkgCheckUtil() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m18228a(@Nullable y35 checkInfo, @Nullable x4d0 resourceResponse) {
        List<zgi> listM209309f;
        if (resourceResponse == null || (listM209309f = resourceResponse.m209309f()) == null) {
            return;
        }
        if (listM209309f.isEmpty()) {
            listM209309f = null;
        }
        if (listM209309f != null) {
            xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new OfflinePkgCheckUtil$checkOfflineFile$$inlined$also$lambda$1(listM209309f, null, checkInfo, resourceResponse), 3, null);
        }
    }
}
