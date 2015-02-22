package com.peony.ccfinder;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@EFragment
public class MainFragment extends Fragment{
	@ViewById(R.id.main_llCategoryKs) View llCategoryKs;
	@ViewById(R.id.main_llCategoryKas) View llCategoryKas;
	@ViewById(R.id.main_llCategoryKolas) View llCategoryKolas;
	@ViewById(R.id.main_llCategoryGr) View llCategoryGr;
	@ViewById(R.id.main_llCategoryNet) View llCategoryNet;
	@ViewById(R.id.main_llCategoryNep) View llCategoryNep;

	public MainFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);
		return rootView;
	}
	
	@Click(R.id.main_llCategoryKs)
	public void toKs() {
		Intent intent = new Intent(getActivity(), CategoryKsActivity.class);
		startActivity(intent);
	}
}
