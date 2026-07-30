package org.eclipse.jetty.util.preventers;

import javax.imageio.ImageIO;

/* JADX INFO: loaded from: classes2.dex */
public class AppContextLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        AbstractLeakPreventer.LOG.debug("Pinning classloader for AppContext.getContext() with " + classLoader, new Object[0]);
        ImageIO.getUseCache();
    }
}
