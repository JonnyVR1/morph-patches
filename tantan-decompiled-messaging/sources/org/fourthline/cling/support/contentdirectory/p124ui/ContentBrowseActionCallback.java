package org.fourthline.cling.support.contentdirectory.p124ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.support.contentdirectory.callback.Browse;
import org.fourthline.cling.support.model.BrowseFlag;
import org.fourthline.cling.support.model.DIDLContent;
import org.fourthline.cling.support.model.SortCriterion;
import org.fourthline.cling.support.model.container.Container;
import org.fourthline.cling.support.model.item.Item;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContentBrowseActionCallback extends Browse {
    private static Logger log = Logger.getLogger(ContentBrowseActionCallback.class.getName());
    protected final DefaultTreeModel treeModel;
    protected final DefaultMutableTreeNode treeNode;

    public ContentBrowseActionCallback(Service service, DefaultTreeModel defaultTreeModel, DefaultMutableTreeNode defaultMutableTreeNode) {
        super(service, ((Container) defaultMutableTreeNode.getUserObject()).getId(), BrowseFlag.DIRECT_CHILDREN, "*", 0L, null, new SortCriterion(true, "dc:title"));
        this.treeModel = defaultTreeModel;
        this.treeNode = defaultMutableTreeNode;
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, final String str) {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.contentdirectory.ui.ContentBrowseActionCallback.5
            @Override // java.lang.Runnable
            public void run() {
                ContentBrowseActionCallback.this.failureUI(str);
            }
        });
    }

    public abstract void failureUI(String str);

    public DefaultTreeModel getTreeModel() {
        return this.treeModel;
    }

    public DefaultMutableTreeNode getTreeNode() {
        return this.treeNode;
    }

    public void insertChild(MutableTreeNode mutableTreeNode) {
        this.treeModel.insertNodeInto(mutableTreeNode, this.treeNode, this.treeNode.getChildCount() <= 0 ? 0 : this.treeNode.getChildCount());
    }

    @Override // org.fourthline.cling.support.contentdirectory.callback.Browse
    public void received(ActionInvocation actionInvocation, DIDLContent dIDLContent) {
        log.fine("Received browse action DIDL descriptor, creating tree nodes");
        final ArrayList arrayList = new ArrayList();
        try {
            Iterator<Container> it = dIDLContent.getContainers().iterator();
            while (it.hasNext()) {
                arrayList.add(new DefaultMutableTreeNode(it.next()) { // from class: org.fourthline.cling.support.contentdirectory.ui.ContentBrowseActionCallback.1
                    public boolean isLeaf() {
                        return false;
                    }
                });
            }
            Iterator<Item> it2 = dIDLContent.getItems().iterator();
            while (it2.hasNext()) {
                arrayList.add(new DefaultMutableTreeNode(it2.next()) { // from class: org.fourthline.cling.support.contentdirectory.ui.ContentBrowseActionCallback.2
                    public boolean isLeaf() {
                        return true;
                    }
                });
            }
        } catch (Exception e) {
            log.fine("Creating DIDL tree nodes failed: " + e);
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, "Can't create tree child nodes: " + e, e));
            failure(actionInvocation, null);
        }
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.contentdirectory.ui.ContentBrowseActionCallback.3
            @Override // java.lang.Runnable
            public void run() {
                ContentBrowseActionCallback.this.updateTreeModel(arrayList);
            }
        });
    }

    public void removeChildren() {
        this.treeNode.removeAllChildren();
        this.treeModel.nodeStructureChanged(this.treeNode);
    }

    @Override // org.fourthline.cling.support.contentdirectory.callback.Browse
    public void updateStatus(final Browse.Status status) {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.fourthline.cling.support.contentdirectory.ui.ContentBrowseActionCallback.4
            @Override // java.lang.Runnable
            public void run() {
                ContentBrowseActionCallback contentBrowseActionCallback = ContentBrowseActionCallback.this;
                contentBrowseActionCallback.updateStatusUI(status, contentBrowseActionCallback.treeNode, contentBrowseActionCallback.treeModel);
            }
        });
    }

    public abstract void updateStatusUI(Browse.Status status, DefaultMutableTreeNode defaultMutableTreeNode, DefaultTreeModel defaultTreeModel);

    public void updateTreeModel(List<DefaultMutableTreeNode> list) {
        log.fine("Adding nodes to tree: " + list.size());
        removeChildren();
        Iterator<DefaultMutableTreeNode> it = list.iterator();
        while (it.hasNext()) {
            insertChild(it.next());
        }
    }

    public ContentBrowseActionCallback(Service service, DefaultTreeModel defaultTreeModel, DefaultMutableTreeNode defaultMutableTreeNode, String str, long j, long j2, SortCriterion... sortCriterionArr) {
        super(service, ((Container) defaultMutableTreeNode.getUserObject()).getId(), BrowseFlag.DIRECT_CHILDREN, str, j, Long.valueOf(j2), sortCriterionArr);
        this.treeModel = defaultTreeModel;
        this.treeNode = defaultMutableTreeNode;
    }
}
