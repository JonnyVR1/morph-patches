package org.fourthline.cling.support.contentdirectory.p005ui;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.meta.Service;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ContentBrowseActionCallbackCreator {
    ActionCallback createContentBrowseActionCallback(Service service, DefaultTreeModel defaultTreeModel, DefaultMutableTreeNode defaultMutableTreeNode);
}
